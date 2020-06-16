package com.example.cipher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView i;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Thread obj=new Thread()
        {
            public void run(){
                try{
                    sleep(2000);

                }catch (Exception t){}
                finally {

                    Intent obj=new Intent(MainActivity.this,Language.class);
                    startActivity(obj);

                }


            }



        };
        obj.start();
    }
}
