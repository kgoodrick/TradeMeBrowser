package nz.co.trademe.trademebrowser.activities;

import android.support.v7.app.ActionBar;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ListView;

import nz.co.trademe.trademebrowser.R;

/**
 * Created by kevin on 20/09/15.
 */
public class ListingsActivityTest extends ActivityInstrumentationTestCase2<ListingsActivity> {

    private ListingsActivity la;
    private ListView listingsList;
    private ActionBar bar;

    public ListingsActivityTest() {
        super(ListingsActivity.class);
    }

    public void setUp() throws Exception {
        super.setUp();
        la = getActivity();
        listingsList = (ListView)la.findViewById(R.id.listingsListView);
        bar = getActivity().getSupportActionBar();
    }

    public void testPreconditions() throws Exception {
        assertNotNull("ListingsActivity is null", la);
        assertNotNull("listingsList listView is null", listingsList);
        assertNotNull("Actionbar is null", bar);
    }

    public void testActionBar() throws Exception {
        assertEquals("Title is incorrect", getActivity().getString(R.string.api_listing), bar.getTitle());
    }
}