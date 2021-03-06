package com.example.admin.myapplicationjhk.model;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    private static final int VERSION_DB = 1;
    private static final String DB_NAME = "database.db";

    public DBHelper(Context context) {
        this(context, DB_NAME, null, VERSION_DB);
    }


    private DBHelper(android.content.Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        createEmptyTable(sqLiteDatabase);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    private void createEmptyTable(SQLiteDatabase database) {
        database.execSQL("create table Weathers(id integer primary key, day text, apparentTemperatureHigh text, " +
                "apparentTemperatureLow text, cloudCover text, pressure text, temperature text)");
    }

}