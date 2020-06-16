package com.example.cipher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginh extends AppCompatActivity {
    EditText u,p;
    Button b1;
    TextView t;
    Appdb obj2;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginh);
        b1 = findViewById(R.id.button3);
        u = findViewById(R.id.editText);
        p = findViewById(R.id.editText2);
        t = findViewById(R.id.textView6);

        sp=getSharedPreferences("dvs1", Context.MODE_PRIVATE);
        obj2 = new Appdb(loginh.this);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ne = new Intent(loginh.this, Registerh.class);
                startActivity(ne);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    String user = u.getText().toString();
                    String pass = p.getText().toString();

                    Cursor cursor = obj2.user_login(user);

                    cursor.moveToFirst();
                    String password = cursor.getString(3);


                    if (password.equals(pass)) {

                        Intent obj=new Intent(loginh.this,Homeh.class);
                        startActivity(obj);
                        cln();

                    } else {
                        cln();
                        Toast.makeText(loginh.this, "Invalid user..", Toast.LENGTH_LONG).show();
                    }

                } catch (Exception t) {
                    cln();
                    Toast.makeText(loginh.this, "Invalid user", Toast.LENGTH_LONG).show();
                }


            }
        });

    }



    public void cln(){

        u.setText(null);
        u.requestFocus();
        p.setText(null);
    }
}
