package com.rockets1131.networkphotoview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
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
        lruImageCache = LruImageCache.instance();
        rQueue = Volley.newRequestQueue(this);
        imageLoader = new ImageLoader(rQueue, lruImageCache);
        networkPhotoView.setImageUrl("http://i6.topit.me/6/5d/45/1131907198420455d6o.jpg", imageLoader);
    }
}
