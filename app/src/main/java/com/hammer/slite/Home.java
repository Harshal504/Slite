package com.hammer.slite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.jar.Attributes;

/**
 * Created by Harshal on 11/12/2017.
 */

public class Home extends SQLiteOpenHelper{

    public Home(Context context) {
        super(context, "mydb", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Registration(id INTEGER PRIMARY KEY,Name TEXT,Email TEXT,Phone_No INTEGER,Password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
      onCreate(db);

    }

    public void insertdata(Regmodel r)
    {
      SQLiteDatabase sl=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("Name",r.getName());
        cv.put("Email",r.getEmail());
        cv.put("Phone_No",r.getPhone());
        cv.put("Password",r.getPassword());
        sl.insert("Registration",null,cv);
    }

     public ArrayList<Regmodel> display(){
        SQLiteDatabase s2=this.getReadableDatabase();
        ArrayList<Regmodel> a=new ArrayList<Regmodel>();
         Cursor c=s2.rawQuery("SELECT * FROM Registration",null);
         c.moveToFirst();
         while (c.isAfterLast()==false){
             Regmodel rm=new Regmodel();
             rm.setName(c.getString(c.getColumnIndex("Name")));
             rm.setEmail(c.getString(c.getColumnIndex("Email")));
            rm.setPhone(c.getString(c.getColumnIndex("Phone_No")));
            rm.setPassword(c.getString(c.getColumnIndex("Password")));
            a.add(rm);
            c.moveToNext();
         }

        return a;


    }

    public boolean vaildate(String username,String passwords){

         return true;
    }
}
