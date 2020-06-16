package com.example.cipher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class webh extends AppCompatActivity {
    WebView w2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webh);
        w2=findViewById(R.id.w1);
        w2.getSettings().setLoadsImagesAutomatically(true);
        w2.getSettings().setJavaScriptEnabled(true);
        w2.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        w2.loadUrl(getIntent().getStringExtra("key_url2"));
    }
}
