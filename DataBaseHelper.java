package com.example.milto.pizzaapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by milton on 11/16/2016.
 */
public class DataBaseHelper extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "OrderList.db";
    private static final String TABLE_NAME = "OrderList";


    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
       // SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            //db.execSQL("CREATE TABLE" + DATABASE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, MOBILE_NO INTEGER, NO_PRODUCT INTEGER," +
            //        " CITY TEXT");
        db.execSQL("CREATE TABLE "+TABLE_NAME+" (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,MOBILE_NO TEXT,NO_PRODUCTS INTEGER,CITY TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST " + TABLE_NAME);
        onCreate(db);


    }
    public boolean insertdata(String name,String phone,int no,String city){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("NAME",name);
        contentValues.put("MOBILE_NO",phone);
        contentValues.put("NO_PRODUCTS",no);
        contentValues.put("CITY", city);
        long result = db.insert(TABLE_NAME,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;

    }

    public Cursor getData(String mobile_number){
        SQLiteDatabase db = this.getWritableDatabase();

        String query = "SELECT * FROM " + TABLE_NAME + " WHERE MOBILE_NO = '" + mobile_number+"'";
        Cursor cursor = db.rawQuery(query, null);
        return cursor;
    }
    public void mildel(String mobile_number){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME,"MOBILE_NO = '"+mobile_number+"'",null);
    }
}
