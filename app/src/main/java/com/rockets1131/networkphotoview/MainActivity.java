package com.rockets1131.networkphotoview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.android.volley.toolbox.ImageLoader;
import com.rockets1131.networkphotoview.widget.NetworkPhotoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NetworkPhotoView networkPhotoView = (NetworkPhotoView)findViewById(R.id.networkphotoview);
    }
}
