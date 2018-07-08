package com.example.admin.myapplicationjhk.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

public class DBManager {
     private DBHelper dbHelper;

    public DBManager(Context context) {
        dbHelper = new DBHelper(context);
    }

    public DBManager(DBHelper dbHelper) {
        this.dbHelper = dbHelper;
    }

    public void addWeather(String day, String apparentTemperatureHigh,
                           String apparentTemperatureLow, String cloudCover, String pressure, String temperature) {
        SQLiteDatabase database = null;
        try {
            database = dbHelper.getWritableDatabase();
            ContentValues contentValues = getContentValues(day, apparentTemperatureHigh, apparentTemperatureLow,
                    cloudCover, pressure, temperature);

            addWeatherInternal(database, contentValues);
            database.beginTransaction();
            database.setTransactionSuccessful();
        } catch (SQLiteException e) {

        } finally {
            if (database != null) {
                if (database.inTransaction()) {
                    database.endTransaction();
                }
            }
        }
    }

    public ContentValues getContentValues(String day, String apparentTemperatureHigh,
                                          String apparentTemperatureLow, String cloudCover, String pressure, String temperature) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("day", day);
        contentValues.put("apparentTemperatureHigh", apparentTemperatureHigh);
        contentValues.put("apparentTemperatureLow", apparentTemperatureLow);
        contentValues.put("cloudCover", cloudCover);
        contentValues.put("pressure", pressure);
        contentValues.put("temperature", temperature);
        return contentValues;
    }

    public void addWeatherInternal(SQLiteDatabase database, ContentValues contentValues) {
        database.insert("Weathers", null, contentValues);
    }

    public String[] getWeatherByDayName(String dayName) {
        Cursor cursor = null;
        String[] stringArray = new String[6];
        SQLiteDatabase database = null;

        try {
            database = dbHelper.getReadableDatabase();
            cursor = database.rawQuery("SELECT * FROM Weathers WHERE day=?", new String[]{dayName});
            if (cursor.getCount() > 0) {
                cursor.moveToFirst();
                stringArray[0] = cursor.getString(cursor.getColumnIndex("day"));
                stringArray[1] = cursor.getString(cursor.getColumnIndex("apparentTemperatureHigh"));
                stringArray[2] = cursor.getString(cursor.getColumnIndex("apparentTemperatureLow"));
                stringArray[3] = cursor.getString(cursor.getColumnIndex("cloudCover"));
                stringArray[4] = cursor.getString(cursor.getColumnIndex("pressure"));
                stringArray[5] = cursor.getString(cursor.getColumnIndex("temperature"));
            }
            return stringArray;
        } finally {
            cursor.close();
        }
    }
}
