package com.example.cipher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class webmedicalh extends AppCompatActivity {
    WebView w3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webmedicalh);
        w3=findViewById(R.id.webmedicalh);
        w3.getSettings().setLoadsImagesAutomatically(true);
        w3.getSettings().setJavaScriptEnabled(true);
        w3.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        w3.loadUrl(getIntent().getStringExtra("key_url1"));

    }
}
