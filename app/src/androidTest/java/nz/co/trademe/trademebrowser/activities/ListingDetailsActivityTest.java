package nz.co.trademe.trademebrowser.activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.TextView;

import com.ms.square.android.expandabletextview.ExpandableTextView;

import nz.co.trademe.trademebrowser.R;

/**
 * Created by kevin on 20/09/15.
 */
public class ListingDetailsActivityTest extends ActivityInstrumentationTestCase2<ListingDetailsActivity> {

    private ListingDetailsActivity lda;
    private ActionBar bar;

    private ViewPager imageViewPager;
    private TextView titleTextView;
    private TextView priceTextView;

    private ExpandableTextView descriptionText;

    private Button buyNowButton;

    public ListingDetailsActivityTest() {
        super(ListingDetailsActivity.class);
    }

    public void setUp() throws Exception {
        super.setUp();
        lda = getActivity();
        bar = getActivity().getSupportActionBar();

        imageViewPager = (ViewPager) lda.findViewById(R.id.imagePager);
        titleTextView = (TextView) lda.findViewById(R.id.titleTextView);
        priceTextView = (TextView) lda.findViewById(R.id.priceTextView);
        descriptionText = (ExpandableTextView) lda.findViewById(R.id.descriptionTextView);
        buyNowButton = (Button) lda.findViewById(R.id.buyNowButton);
    }

    public void testPreconditions() throws Exception {
        assertNotNull("ListingDetailsActivity is null", lda);
        assertNotNull("Actionbar is null", bar);
        assertNotNull("ImagViewPager is null", imageViewPager);
        assertNotNull("TitleTextView is null", titleTextView);
        assertNotNull("PriceTextView is null", priceTextView);
        assertNotNull("DescriptionText is null", descriptionText);
        assertNotNull("BuyNowButton is null", buyNowButton);
    }
}