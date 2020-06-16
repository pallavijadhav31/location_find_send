package com.example.cipher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Medicallist extends AppCompatActivity {

    String scheme[]={"Pradhan Mantri Matritva Vandana Yojan","Pradhan Mantri Surakshit Matritva Abhiyan"," Sanitease"," Janani Suraksha Yojana"};
    String url[]={"https://en.wikipedia.org/wiki/Pradhan_Mantri_Matru_Vandana_Yojana","https://vikaspedia.in/health/health-campaigns/pradhan-mantri-surakshit-matritva-abhiyan","http://sulabhenvis.nic.in/LatestNewsArchieve.aspx?Id=11855&Year=2017","https://en.wikipedia.org/?title=Janani_Suraksha_Yojana&redirect=no"};
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicallist);
        list=findViewById(R.id.l2);
        ArrayAdapter<String> arr;
        arr=new ArrayAdapter<String>(Medicallist.this,R.layout.support_simple_spinner_dropdown_item,scheme);

        list.setAdapter(arr);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str1=scheme[position];
                String str2=url[position];
                Intent obj3=new Intent(Medicallist.this,webm.class);
                obj3.putExtra("key_url1",str2);
                obj3.putExtra("key_scheme1",str1);
                startActivity(obj3);


            }
        });
    }

}
