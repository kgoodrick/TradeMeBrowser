package nz.co.trademe.trademebrowser.adapters;

import android.test.mock.MockContext;
import android.view.View;
import android.widget.TextView;

import junit.framework.TestCase;

import java.util.LinkedList;
import java.util.List;

import nz.co.trademe.trademebrowser.R;
import nz.co.trademe.trademebrowser.objects.Listing;

/**
 * Created by kevin on 21/09/15.
 */
public class ListingsAdapterTest extends TestCase {

    ListingsAdapter adapter;
    MockContext context;

    public void setUp() throws Exception {
        super.setUp();
        context = new MockContext();

        List<Listing> listings = new LinkedList<Listing>();
        for (int i = 0; i < 10; i++) {
            Listing l = new Listing();
            l.setTitle("title" + i);
            l.setBuyNowPrice(i);
            l.setCategoryPath("path" + i);
            l.setCategory("cat" + i);
            listings.add(l);
        }

        adapter = new ListingsAdapter(context, listings);
    }

    public void tearDown() throws Exception {
        super.tearDown();
        adapter = null;
    }

    public void testGetCount() throws Exception {
        assertTrue(adapter.getCount() == 10);
    }

    public void testGetItem() throws Exception {
        Listing listing = (Listing) adapter.getItem(5);
        assertEquals(5, listing.getBuyNowPrice());
        assertEquals("cat5", listing.getCategory());
    }

    public void testGetView() throws Exception {
        View view = adapter.getView(4, null, null);

        TextView bnp = (TextView)view.findViewById(R.id.listingBuyNowPriceTextView);

        assertNotNull("view is null", view);
        assertNotNull("category name textview is null", bnp);

        assertEquals("Category name does not match", "4", bnp.getText());
    }
}