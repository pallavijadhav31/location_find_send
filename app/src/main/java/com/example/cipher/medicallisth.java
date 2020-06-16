package com.example.cipher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class medicallisth extends AppCompatActivity {
    String scheme[]={"प्रधानमंत्री मातृ वंदना योजना","प्रधानमंत्री सुरक्षित मातृत्व अभियान","Stree Swabhiman","जननी सुरक्षा योजना"};
    String url[]={"https://www.prabhasakshi.com/expertopinion/what-is-pradhanmantri-matru-vandana-yojana-and-how-to-take-its-advantage","https://pmsma.nhp.gov.in/?lang=hi#:~:text=%E0%A4%AA%E0%A5%8D%E0%A4%B0%E0%A4%A7%E0%A4%BE%E0%A4%A8%E0%A4%AE%E0%A4%82%E0%A4%A4%E0%A5%8D%E0%A4%B0%E0%A5%80%20%E0%A4%B8%E0%A5%81%E0%A4%B0%E0%A4%95%E0%A5%8D%E0%A4%B7%E0%A4%BF%E0%A4%A4%20%E0%A4%AE%E0%A4%BE%E0%A4%A4%E0%A5%83%E0%A4%A4%E0%A5%8D%E0%A4%B5%20%E0%A4%85%E0%A4%AD%E0%A4%BF%E0%A4%AF%E0%A4%BE%E0%A4%A8%20(%E0%A4%AA%E0%A5%80%E0%A4%8F%E0%A4%AE%E0%A4%8F%E0%A4%B8%E0%A4%8F%E0%A4%AE%E0%A4%8F,%E0%A4%A8%E0%A5%8D%E0%A4%AF%E0%A5%82%E0%A4%A8%E0%A4%A4%E0%A4%AE%20%E0%A4%AA%E0%A5%88%E0%A4%95%E0%A5%87%E0%A4%9C%20%E0%A4%AA%E0%A5%8D%E0%A4%B0%E0%A4%A6%E0%A4%BE%E0%A4%A8%20%E0%A4%95%E0%A4%BF%E0%A4%AF%E0%A4%BE%20%E0%A4%9C%E0%A4%BE%E0%A4%8F%E0%A4%97%E0%A4%BE%E0%A5%A4","https://www.bollywoodhungama.com/hindi/videos/esha-gupta-launch-sanitease-bio-degradable-pads-program-91497/","https://www.drishtiias.com/hindi/daily-updates/daily-news-analysis/janani-suraksha-yojana"};
    ListView l3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicallisth);
        l3=findViewById(R.id.ll);
        ArrayAdapter<String> arr;
        arr=new ArrayAdapter<String>(medicallisth.this,R.layout.support_simple_spinner_dropdown_item,scheme);

        l3.setAdapter(arr);
        l3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str1=scheme[position];
                String str2=url[position];
                Intent obj3=new Intent(medicallisth.this,webmedicalh.class);
                obj3.putExtra("key_url1",str2);
                obj3.putExtra("key_scheme1",str1);
                startActivity(obj3);


            }
        });

    }
}
