package nz.co.trademe.trademebrowser.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import java.util.List;

import nz.co.trademe.trademebrowser.R;
import nz.co.trademe.trademebrowser.adapters.ListingsAdapter;
import nz.co.trademe.trademebrowser.objects.FoundCategory;
import nz.co.trademe.trademebrowser.objects.SearchResults;
import nz.co.trademe.trademebrowser.util.TMJsonObjectRequest;
import nz.co.trademe.trademebrowser.util.VolleySingleton;

/**
 * Created by kevin on 19/09/15.
 */
public class ListingsActivity extends AppCompatActivity {

    public static final String NUMBER_OF_ROWS = "20";

    private VolleySingleton volleySingleton;
    AlertDialog alertDialog;

    private ListView listingsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listings);

        volleySingleton = VolleySingleton.getInstance(this);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setIcon(R.drawable.trademe_icon_sm);
            actionBar.setDisplayShowHomeEnabled(true);

        }

        listingsListView = (ListView)findViewById(R.id.listingsListView);

        getListings(getIntent().getStringExtra(getString(R.string.category_id)));
    }

    @Override
    protected void onStop() {
        super.onStop();
        volleySingleton.getRequestQueue().cancelAll("GET");
    }

    private void getListings(String categoryId) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(getString(R.string.api_scheme))
                .authority(getString(R.string.api_authority))
                .appendPath(getString(R.string.api_version))
                .appendPath(getString(R.string.api_search))
                .appendPath(getString(R.string.api_general) + getString(R.string.api_response_format))
                .appendQueryParameter(getString(R.string.param_category), categoryId)
                .appendQueryParameter(getString(R.string.param_rows), NUMBER_OF_ROWS);
        String url = builder.build().toString();

        TMJsonObjectRequest getCategoriesRequest = new TMJsonObjectRequest(this, Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {
                Gson gson = new GsonBuilder().create();
                SearchResults searchResults = gson.fromJson(jsonObject.toString(), SearchResults.class);
                listingsListView.setAdapter(new ListingsAdapter(ListingsActivity.this, searchResults.getList()));
                if (searchResults.getFoundCategories().size() > 0) {
                    showSubCategories(searchResults.getFoundCategories());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Toast.makeText(ListingsActivity.this, "Something went wrong!", Toast.LENGTH_LONG).show();
                volleyError.printStackTrace();
                Log.e(getApplicationInfo().name, "Volley error", volleyError);
            }
        });
        getCategoriesRequest.addAuthorisation(getString(R.string.consumer_key), getString(R.string.consumer_secret));
        volleySingleton.addToRequestQueue(getCategoriesRequest, "GET");
    }

    private void showSubCategories(List<FoundCategory> foundCategories) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View convertView = (View) inflater.inflate(R.layout.category_dialog, null);
        builder.setView(convertView);
        ListView lv = (ListView) convertView.findViewById(R.id.listView1);
        lv.setAdapter(getAdapter(this, foundCategories));
        alertDialog = builder.create();
        alertDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        alertDialog.setCanceledOnTouchOutside(true);

        Window window = alertDialog.getWindow();
        window.setGravity(Gravity.BOTTOM);

        alertDialog.show();
    }

    private BaseAdapter getAdapter(final Context context, final List<FoundCategory> categories) {
        return new BaseAdapter() {

            @Override
            public int getCount() {
                return categories.size();
            }

            @Override
            public Object getItem(int position) {
                return categories.get(position);
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if (convertView == null) {
                    LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
                    convertView = mInflater.inflate(R.layout.category_list_item, null);
                }

                TextView categoryNameTextView = (TextView)convertView.findViewById(R.id.categoryNameTextView);

                final FoundCategory rowPos = categories.get(position);

                categoryNameTextView.setText(rowPos.getName());

                categoryNameTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getListings(rowPos.getCategory());
                        alertDialog.dismiss();
                    }
                });

                return convertView;
            }
        };
    }


}