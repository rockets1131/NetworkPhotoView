package com.rockets1131.networkphotoview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;
import com.rockets1131.networkphotoview.widget.NetworkPhotoView;

public class MainActivity extends AppCompatActivity {
    private RequestQueue rQueue;
    private LruImageCache lruImageCache;
    private ImageLoader imageLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NetworkPhotoView networkPhotoView = (NetworkPhotoView)findViewById(R.id.networkphotoview);
        //NetworkImageView networkPhotoView = (NetworkImageView)findViewById(R.id.networkphotoview);

        lruImageCache = LruImageCache.instance();
        rQueue = Volley.newRequestQueue(this);
        imageLoader = new ImageLoader(rQueue, lruImageCache);
        networkPhotoView.setImageUrl("http://pic.nipic.com/2008-05-07/20085722191339_2.jpg", imageLoader);
    }
}
