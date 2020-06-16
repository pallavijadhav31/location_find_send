package com.example.cipher;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button11);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);

        b6 = findViewById(R.id.button11);
        b6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View v) {
                Intent obj3 = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 9166817041"));
                startActivity(obj3);

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj=new Intent(Home.this,Finance.class);
                startActivity(obj);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj=new Intent(Home.this,Healthcare.class);
                startActivity(obj);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obj=new Intent(Home.this, complain.class);
                startActivity(obj);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob=new Intent(Home.this,gps.class);
                startActivity(ob);
            }
        });

    }
}
