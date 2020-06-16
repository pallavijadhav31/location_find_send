package com.example.cipher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    Button b;
    EditText e1,e2,e3,e4;
    Appdb obj;
    static TextView v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        b=findViewById(R.id.button4);
         e1=findViewById(R.id.textView4);
        e2=findViewById(R.id.textView7);
        e3=findViewById(R.id.textView8);
        e4=findViewById(R.id.textView9);
        v=findViewById(R.id.t);
        obj=new Appdb(Register.this);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obj.user_register(e1.getText().toString(),e3.getText().toString());
                if (e1.getText().toString().equals("") == true || e2.getText().toString().equals("") == true || e3.getText().toString().equals("") == true || e4.getText().toString().equals("") == true) {
                    Toast.makeText(getApplicationContext(), "Fields are empty", Toast.LENGTH_LONG).show();
                } else {

                    e1.setText(null);
                    e2.setText(null);
                    e3.setText(null);
                    e4.setText(null);
                    Intent obj = new Intent(Register.this, login.class);
                    startActivity(obj);
                }


            }
        });

    }
}
