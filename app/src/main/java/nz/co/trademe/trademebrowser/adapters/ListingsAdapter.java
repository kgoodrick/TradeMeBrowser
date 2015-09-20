package nz.co.trademe.trademebrowser.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import nz.co.trademe.trademebrowser.R;
import nz.co.trademe.trademebrowser.activities.ListingDetailsActivity;
import nz.co.trademe.trademebrowser.objects.Listing;

/**
 * Created by kevin on 19/09/15.
 */
public class ListingsAdapter extends BaseAdapter {

    private Context context;
    private List<Listing> listings;

    public ListingsAdapter(Context context, List<Listing> listings) {
        this.context = context;
        this.listings = listings;
    }

    @Override
    public int getCount() {
        return listings.size();
    }

    @Override
    public Object getItem(int position) {
        return listings.get(position);
    }

    @Override
    public long getItemId(int position) {
        return (long) listings.get(position).getListingId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.listing_list_item, null);
        }

        RelativeLayout listItem = (RelativeLayout)convertView.findViewById(R.id.listItem);
        ImageView previewImage = (ImageView)convertView.findViewById(R.id.listingPreviewImageView);
        TextView listingLocation = (TextView)convertView.findViewById(R.id.listingLocationTextView);
        TextView listingDescription = (TextView)convertView.findViewById(R.id.listingDescriptionTextView);
        TextView listingReserve = (TextView)convertView.findViewById(R.id.listingReserveTextView);
        TextView listingBidPrice = (TextView)convertView.findViewById(R.id.listingBidPriceTextView);
        TextView listingBidCount = (TextView)convertView.findViewById(R.id.listingBidCountTextView);
        TextView listingBuyNow = (TextView)convertView.findViewById(R.id.listingBuyNowTextView);
        TextView listingBuyNowPrice = (TextView)convertView.findViewById(R.id.listingBuyNowPriceTextView);

        final Listing rowPos = listings.get(position);

        updateImage(previewImage, rowPos);

        listingLocation.setText(rowPos.getSuburb().length() > 0 ? rowPos.getSuburb() : "");
        listingDescription.setText(rowPos.getTitle().length() > 0 ? rowPos.getTitle() : "");
        listingReserve.setText(getReserveText(rowPos.getReserveState()));
        listingBidPrice.setText(rowPos.getPriceDisplay().length() > 0 ? rowPos.getPriceDisplay() : "");
        listingBidCount.setText(rowPos.getBidCount() > 0 ? String.valueOf(rowPos.getBidCount()) : "");
        listingBuyNow.setText(rowPos.isHasBuyNow() ? "Buy Now" : "");
        if (rowPos.getBuyNowPrice() != null) {
            listingBuyNowPrice.setText(rowPos.getBuyNowPrice().doubleValue() > 0 ? "$" + rowPos.getBuyNowPrice() : "");
        } else {
            listingBuyNowPrice.setText("");
        }

        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ListingDetailsActivity.class);
                intent.putExtra(context.getString(R.string.listing_id), rowPos.getListingId());
                context.startActivity(intent);
            }
        });

        return convertView;
    }

    private String getReserveText(int reserveState) {
        switch (reserveState){
            case 0: //NONE
                return "No reserve";
            case 1: //MET
                return "Reserve met";
            case 2: //NOTMET
                return "Reserve not met";
            case 3: //NOTAPPLICABLE
                return "";
        }
        return "";
    }

    private void updateImage(final ImageView previewImage, Listing rowPos) {
        Picasso.with(context)
                .load(rowPos.getPictureHref())
                .placeholder(R.mipmap.ic_launcher)
                .resize(200, 200)
                .centerCrop()
                .into(previewImage);
    }
}
