package nz.co.trademe.trademebrowser.adapters;

import android.test.mock.MockContext;
import android.view.View;
import android.widget.TextView;

import junit.framework.TestCase;

import java.util.LinkedList;
import java.util.List;

import nz.co.trademe.trademebrowser.R;
import nz.co.trademe.trademebrowser.objects.Category;

/**
 * Created by kevin on 19/09/15.
 */
public class CategoriesAdapterTest extends TestCase {

    CategoriesAdapter adapter;
    MockContext context;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        context = new MockContext();

        List<Category> categories = new LinkedList<Category>();
        for(int i = 0; i < 10; i++) {
            Category cat = new Category();
            cat.setName("category" + i);
            cat.setNumber(String.valueOf(i));
            categories.add(cat);
        }

        adapter = new CategoriesAdapter(context, categories);
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        adapter = null;
    }

    public void testGetCount() throws Exception {
        assertTrue(adapter.getCount() == 10);
    }

    public void testGetItem() throws Exception {
        Category cat = (Category) adapter.getItem(5);
        assertEquals(5, cat.getNumber());
        assertEquals("category5", cat.getName());
    }

    public void testGetItemId() throws Exception {
        assertEquals(0, adapter.getItemId(5));
        assertEquals(0, adapter.getItemId(2));
        assertEquals(0, adapter.getItemId(7));
        assertEquals(0, adapter.getItemId(0));
    }

    public void testGetView() throws Exception {
        View view = adapter.getView(4, null, null);

        TextView catName = (TextView)view.findViewById(R.id.categoryNameTextView);

        assertNotNull("view is null", view);
        assertNotNull("category name textview is null", catName);

        assertEquals("Category name does not match", "category4", catName.getText());
    }
}