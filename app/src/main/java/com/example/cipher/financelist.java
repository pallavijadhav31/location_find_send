package com.example.cipher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class financelist extends AppCompatActivity {


    String scheme[]={"Pradhan Mantri Mudra Yojana"," Atal Pension Yogana","Pradhan Mantri Suraksha Bima Yojana","Jeevan Jyoti Bima Yojana","Sukanaya smridhi yojana","DigiLockerScheme","Gold Monetisation Scheme","Sovergin Gold Bond Scheme","Indian Gold Coin"};
    String url[]={"https://en.wikipedia.org/wiki/Micro_Units_Development_and_Refinance_Agency_Bank","https://www.india.gov.in/spotlight/atal-pension-yojana","https://en.wikipedia.org/wiki/Pradhan_Mantri_Suraksha_Bima_Yojana","https://en.wikipedia.org/wiki/Pradhan_Mantri_Jeevan_Jyoti_Bima_Yojana","https://en.wikipedia.org/wiki/Sukanya_Samriddhi_Account","https://en.wikipedia.org/wiki/DigiLocker","https://www.paisabazaar.com/gold-rate/gold-monetisation-scheme/","https://en.wikipedia.org/wiki/Gold_bond","https://en.wikipedia.org/wiki/Coinage_of_India"};
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financelist);
        list=findViewById(R.id.l1);
        ArrayAdapter<String> arr;
        arr=new ArrayAdapter<String>(financelist.this,R.layout.support_simple_spinner_dropdown_item,scheme);
        list.setAdapter(arr);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String str1=scheme[position];
               String str2=url[position];
               Intent obj1=new Intent(financelist.this,web.class);
               obj1.putExtra("key_url",str2);
               obj1.putExtra("key_scheme",str1);
               startActivity(obj1);


            }
        });
    }
}


