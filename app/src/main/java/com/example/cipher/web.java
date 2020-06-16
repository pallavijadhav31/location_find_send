package com.example.cipher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class web extends AppCompatActivity {
    WebView w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        w=findViewById(R.id.web);
        w.getSettings().setLoadsImagesAutomatically(true);
        w.getSettings().setJavaScriptEnabled(true);
        w.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        w.loadUrl(getIntent().getStringExtra("key_url"));

    }
}
