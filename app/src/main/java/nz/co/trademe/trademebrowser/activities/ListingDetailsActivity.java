package nz.co.trademe.trademebrowser.activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ms.square.android.expandabletextview.ExpandableTextView;
import com.viewpagerindicator.CirclePageIndicator;

import org.json.JSONObject;

import java.util.List;

import nz.co.trademe.trademebrowser.R;
import nz.co.trademe.trademebrowser.fragments.PhotoPagerFragment;
import nz.co.trademe.trademebrowser.objects.ListingDetails;
import nz.co.trademe.trademebrowser.objects.Photo;
import nz.co.trademe.trademebrowser.util.TMJsonObjectRequest;
import nz.co.trademe.trademebrowser.util.VolleySingleton;

/**
 * Created by kevin on 20/09/15.
 */
public class ListingDetailsActivity extends AppCompatActivity {

    private VolleySingleton volleySingleton;

    private ViewPager imageViewPager;
    private CirclePageIndicator imageIndicator;
    private TextView titleTextView;
    private TextView priceTextView;

    private ExpandableTextView descriptionText;

    private Button buyNowButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing_details);

        volleySingleton = VolleySingleton.getInstance(this);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setIcon(R.drawable.trademe_icon_sm);
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.hide();
        }

        titleTextView = (TextView) findViewById(R.id.titleTextView);
        priceTextView = (TextView) findViewById(R.id.priceTextView);
        descriptionText = (ExpandableTextView) findViewById(R.id.descriptionTextView);
        buyNowButton = (Button) findViewById(R.id.buyNowButton);

        String listingId = String.valueOf(getIntent().getIntExtra(getString(R.string.listing_id), 0));
        
        getListingDetails(listingId);
    }

    @Override
    protected void onStop() {
        super.onStop();
        volleySingleton.getRequestQueue().cancelAll("GET");
    }

    private void getListingDetails(String listingId) {
//        https://api.trademe.co.nz/v1/Listings/{listingId}.{file_format}
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(getString(R.string.api_scheme))
                .authority(getString(R.string.api_authority))
                .appendPath(getString(R.string.api_version))
                .appendPath(getString(R.string.api_listing))
                .appendPath(listingId + getString(R.string.api_response_format));
        String url = builder.build().toString();

        TMJsonObjectRequest getCategoriesRequest = new TMJsonObjectRequest(this, Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {
                Gson gson = new GsonBuilder().create();
                ListingDetails listingDetails = gson.fromJson(jsonObject.toString(), ListingDetails.class);
                displayPhotos(listingDetails);
                displayListingDetails(listingDetails);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Toast.makeText(ListingDetailsActivity.this, "Something went wrong!", Toast.LENGTH_LONG).show();
                volleyError.printStackTrace();
                Log.e(getApplicationInfo().name, "Volley error", volleyError);
            }
        });
        getCategoriesRequest.addAuthorisation(getString(R.string.consumer_key), getString(R.string.consumer_secret));
        volleySingleton.addToRequestQueue(getCategoriesRequest, "GET");
    }

    private void displayListingDetails(ListingDetails listingDetails) {
        if (listingDetails.isHasBuyNow()) {
            buyNowButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ListingDetailsActivity.this, "Didn't quite get this implemented.  ;)", Toast.LENGTH_LONG).show();
                }
            });
        } else {
            buyNowButton.setVisibility(View.INVISIBLE);
        }

        titleTextView.setText(listingDetails.getTitle());
        priceTextView.setText(listingDetails.getPriceDisplay());
        descriptionText.setText(listingDetails.getBody());
    }

    private void displayPhotos(ListingDetails listingDetails) {
        PhotosViewPagerAdapter adapter = new PhotosViewPagerAdapter(getSupportFragmentManager(), listingDetails.getPhotos());

        imageViewPager = (ViewPager) findViewById(R.id.imagePager);
        imageViewPager.setAdapter(adapter);
        imageIndicator = (CirclePageIndicator) findViewById(R.id.imageIndicator);
        imageIndicator.setViewPager(imageViewPager);
    }

    private class PhotosViewPagerAdapter extends FragmentStatePagerAdapter {

        private FragmentManager fragmentManager;
        private List<Photo> photos;

        public PhotosViewPagerAdapter(FragmentManager fragmentManager, List<Photo> photos) {
            super(fragmentManager);
            this.fragmentManager = fragmentManager;
            this.photos = photos;
        }

        @Override
        public Fragment getItem(int position) {
            Photo rowPos = photos.get(position);

            PhotoPagerFragment photoFragment = new PhotoPagerFragment();
            Bundle args = new Bundle();
            args.putString(getString(R.string.photo_url), rowPos.getValue().getLarge());
            photoFragment.setArguments(args);
            return photoFragment;
        }

        @Override
        public int getCount() {
            return photos.size();
        }
    }
}
