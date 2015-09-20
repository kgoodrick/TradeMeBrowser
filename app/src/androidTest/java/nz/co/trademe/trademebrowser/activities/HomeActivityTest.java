package nz.co.trademe.trademebrowser.activities;

import android.support.v7.app.ActionBar;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ListView;

import nz.co.trademe.trademebrowser.R;

/**
 * Created by kevin on 19/09/15.
 */
public class HomeActivityTest extends ActivityInstrumentationTestCase2<HomeActivity> {

    private HomeActivity ha;
    private ListView categoriesList;
    private ActionBar bar;

    public HomeActivityTest() {
        super(HomeActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ha = getActivity();
        categoriesList = (ListView)ha.findViewById(R.id.categoriesListView);
        bar = getActivity().getSupportActionBar();
    }

    public void testPreconditions() throws Exception {
        assertNotNull("HomeActivity is null", ha);
        assertNotNull("categoriesList listView is null", categoriesList);
        assertNotNull("Actionbar is null", bar);
    }

    public void testActionBar() throws Exception {
        assertEquals("Title is incorrect", getActivity().getString(R.string.api_categories), bar.getTitle());
    }
}