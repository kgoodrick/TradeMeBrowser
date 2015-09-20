package nz.co.trademe.trademebrowser.util;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kevin on 17/09/15.
 */
public class TMJsonObjectRequest extends JsonObjectRequest {

    private Context context;

    public TMJsonObjectRequest(Context context, int method, String url, JSONObject jsonRequest, Response.Listener<JSONObject> listener, Response.ErrorListener errorListener) {
        super(method, url, jsonRequest, listener, errorListener);
        this.context = context;
    }

    Map<String, String> headers = new HashMap<String, String>();

    public void addHeader(String key, String value) {
        headers.put(key, value);
    }

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        return headers;
    }

    public void addAuthorisation(String key, String secret) {
        StringBuilder builder = new StringBuilder();
        builder.append("OAuth oauth_consumer_key=\"")
                .append(key)
                .append("\", oauth_signature_method=\"PLAINTEXT\", oauth_signature=\"")
                .append(secret)
                .append("&\"");
        String oauth = builder.toString();
        headers.put("Authorization", oauth);
    }
}
