package com.example.cipher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class financelisth extends AppCompatActivity {

    String scheme[]={"प्रधानमंत्री मुद्रा योजना"," अटल पेंशन योगाना","प्रधानमंत्री सुरक्षा बीमा योजना","सुकन्या समृद्धि योजना","डिजिलॉकर ","स्वर्ण मुद्रीकरण योजना", "सॉवरिन गोल्ड बॉन्ड स्कीम", "भारतीय सोने का सिक्का"};
    String url[]={"https://www.paisabazaar.com/hindi/business-loan/mudra-loan-application-form/","http://www.dif.mp.gov.in/apy.htm","http://www.dif.mp.gov.in/pmjsby.htm","https://hindi.webdunia.com/national-hindi-news/what-is-sukanya-samriddhi-yojana-116051800062_1.html","https://hindi.goodreturns.in/classroom/2019/04/do-you-know-what-is-digi-locker-how-to-sign-up-know-all-about-digi-locker-007524.html","https://hi.wikipedia.org/wiki/%E0%A4%B8%E0%A5%8D%E0%A4%B5%E0%A4%B0%E0%A5%8D%E0%A4%A3_%E0%A4%AE%E0%A5%81%E0%A4%A6%E0%A5%8D%E0%A4%B0%E0%A5%80%E0%A4%95%E0%A4%B0%E0%A4%A3_%E0%A4%AF%E0%A5%8B%E0%A4%9C%E0%A4%A8%E0%A4%BE#:~:text=%E0%A4%B8%E0%A5%8D%E0%A4%B5%E0%A4%B0%E0%A5%8D%E0%A4%A3%20%E0%A4%AE%E0%A5%81%E0%A4%A6%E0%A5%8D%E0%A4%B0%E0%A5%80%E0%A4%95%E0%A4%B0%E0%A4%A3%20%E0%A4%AF%E0%A5%8B%E0%A4%9C%E0%A4%A8%E0%A4%BE%20(%E0%A4%97%E0%A5%8B%E0%A4%B2%E0%A5%8D%E0%A4%A1%20%E0%A4%AE%E0%A5%8B%E0%A4%A8%E0%A5%87%E0%A4%9F%E0%A4%BE%E0%A4%88%E0%A4%9C%E0%A5%87%E0%A4%B6%E0%A4%A8,%E0%A4%AC%E0%A4%9C%E0%A4%9F%20%E0%A4%AE%E0%A5%87%E0%A4%82%20%E0%A4%95%E0%A5%80%20%E0%A4%97%E0%A5%8D%E0%A4%AF%E0%A5%80%20%E0%A4%A5%E0%A5%80%E0%A5%A4&text=5%20%E0%A4%A8%E0%A4%B5%E0%A4%82%E0%A4%AC%E0%A4%B0%202015%20%E0%A4%B8%E0%A5%87%20%E0%A4%AF%E0%A4%B9,%E0%A4%86%E0%A4%AF%E0%A4%BE%E0%A4%A4%20%E0%A4%95%E0%A5%8B%20%E0%A4%95%E0%A4%AE%20%E0%A4%95%E0%A4%B0%E0%A4%A8%E0%A4%BE%20%E0%A4%B9%E0%A5%88%E0%A5%A4","https://www.india.com/hindi-news/business-hindi/gold-bond-scheme-2020-sovereign-gold-bond-open-today-for-subscription-know-all-details-about-it-in-hindi-here-4025585/#:~:text=Sovereign%20Gold%20Bond%20(SGB)%20%E0%A4%95%E0%A5%8D%E0%A4%AF%E0%A4%BE,RBI%20%E0%A4%9C%E0%A4%BE%E0%A4%B0%E0%A5%80%20%E0%A4%95%E0%A4%B0%20%E0%A4%B0%E0%A4%B9%E0%A4%BE%20%E0%A4%B9%E0%A5%88.","https://economictimes.indiatimes.com/hindi/wealth/nivesh/7-things-to-know-while-buying-gold-coins/articleshow/61051743.cms?from=mdr"};
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financelisth);
        list=findViewById(R.id.l1);
        ArrayAdapter<String> arr;
        arr=new ArrayAdapter<String>(financelisth.this,R.layout.support_simple_spinner_dropdown_item,scheme);
        list.setAdapter(arr);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str1=scheme[position];
                String str2=url[position];
                Intent obj2=new Intent(financelisth.this,webh.class);
                obj2.putExtra("key_url2",str2);
                obj2.putExtra("key_scheme2",str1);
                startActivity(obj2);


            }
        });
    }
}
