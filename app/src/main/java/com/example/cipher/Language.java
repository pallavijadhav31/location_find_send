package com.example.cipher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Language extends AppCompatActivity {
    ImageView v1,v2;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        v1=findViewById(R.id.button);
        v2=findViewById(R.id.button2);
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ne=new Intent(Language.this,login.class);
                startActivity(ne);
            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ne1=new Intent(Language.this,loginh.class);
                startActivity(ne1);
            }
        });

    }
}
