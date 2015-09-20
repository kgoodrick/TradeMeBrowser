package nz.co.trademe.trademebrowser.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import nz.co.trademe.trademebrowser.R;

/**
 * Created by kevin on 20/09/15.
 */
public class PhotoPagerFragment extends Fragment {

    private String photoUrl;

    public PhotoPagerFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        photoUrl = getArguments().getString(getString(R.string.photo_url));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        ImageView rootView = (ImageView) inflater.inflate(R.layout.fragment_photo_pager, container, false);

        Picasso.with(getActivity())
                .load(photoUrl)
                .placeholder(R.mipmap.ic_launcher)
                .resize(800, 800)
                .centerCrop()
                .into(rootView);

        return rootView;
    }
}
