package nz.co.trademe.trademebrowser.activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import nz.co.trademe.trademebrowser.R;
import nz.co.trademe.trademebrowser.adapters.CategoriesAdapter;
import nz.co.trademe.trademebrowser.objects.Category;
import nz.co.trademe.trademebrowser.util.TMJsonObjectRequest;
import nz.co.trademe.trademebrowser.util.VolleySingleton;

public class HomeActivity extends AppCompatActivity {

    VolleySingleton volleySingleton;

    private ListView categoriesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        volleySingleton = VolleySingleton.getInstance(this);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setIcon(R.drawable.trademe_icon_sm);
            actionBar.setTitle(getString(R.string.api_categories));
            actionBar.setDisplayShowHomeEnabled(true);

        }

        categoriesListView = (ListView)findViewById(R.id.categoriesListView);

        getCategories();
    }

    @Override
    protected void onStop() {
        super.onStop();
        volleySingleton.getRequestQueue().cancelAll("GET");
    }

    private void getCategories() {
        String categoryNumber = "";
        String categoryPart = categoryNumber.length() > 0 ? "/" + categoryNumber : "";

        Uri.Builder builder = new Uri.Builder();
        builder.scheme(getString(R.string.api_scheme))
                .authority(getString(R.string.api_authority))
                .appendPath(getString(R.string.api_version))
                .appendPath(getString(R.string.api_categories) +
                        categoryPart +
                        getString(R.string.api_response_format));
        String url = builder.build().toString();

        TMJsonObjectRequest getCategoriesRequest = new TMJsonObjectRequest(this, Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {
                Gson gson = new GsonBuilder().create();
                Category categories = gson.fromJson(jsonObject.toString(), Category.class);
                categoriesListView.setAdapter(new CategoriesAdapter(HomeActivity.this, categories.getSubCategories()));
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Toast.makeText(HomeActivity.this, "Something went wrong!", Toast.LENGTH_LONG).show();
                volleyError.printStackTrace();
                Log.e(getApplicationInfo().name, "Volley error", volleyError);
            }
        });
        volleySingleton.addToRequestQueue(getCategoriesRequest, "GET");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_exit:
                finish();
                break;
            default:

        }
        return super.onOptionsItemSelected(item);
    }
}
