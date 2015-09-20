package nz.co.trademe.trademebrowser.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import nz.co.trademe.trademebrowser.R;
import nz.co.trademe.trademebrowser.activities.ListingsActivity;
import nz.co.trademe.trademebrowser.objects.Category;

/**
 * Created by kevin on 18/09/15.
 */
public class CategoriesAdapter extends BaseAdapter {

    private Context context;
    private List<Category> categories;

    public CategoriesAdapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

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

        final Category rowPos = categories.get(position);

        categoryNameTextView.setText(rowPos.getName());

        categoryNameTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(context, rowPos.getNumber(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(context, ListingsActivity.class);
                intent.putExtra("category_id", rowPos.getNumber());
                context.startActivity(intent);
            }
        });

        return convertView;
    }
}
