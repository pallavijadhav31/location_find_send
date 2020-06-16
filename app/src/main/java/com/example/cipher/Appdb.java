package com.example.cipher;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Appdb extends SQLiteOpenHelper {
    public Appdb(@Nullable Context context) {
        super(context, "NEW1", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String tab="create table registert(id integer primary key autoincrement,user text ,email text,password text,repassword text, UNIQUE (USER))";
        db.execSQL(tab);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void user_register(String u,String p){

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("user", u);
        cv.put("password", p);
        db.insert("registert", null, cv);
        db.close();

    }

    public Cursor user_login(String u){
        SQLiteDatabase db=this.getWritableDatabase();
        String lg="select* from registert where user='"+u+"'";
        Cursor c=db.rawQuery(lg,null);
        return  c;
    }
    public Cursor check(String u)
    {

        SQLiteDatabase db=this.getWritableDatabase();
        String t="select user from registert where user='"+u+"'";
        db.execSQL(t);
        Cursor c=db.rawQuery(t,null);
        return c;


    }
}

