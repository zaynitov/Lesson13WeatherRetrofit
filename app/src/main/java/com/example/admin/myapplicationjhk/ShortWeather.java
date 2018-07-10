package com.example.admin.myapplicationjhk;

import android.os.Parcel;
import android.os.Parcelable;

public class ShortWeather implements Parcelable{
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }

    public ShortWeather(String dayName, String temp) {
        this.dayName = dayName;
        this.temp = temp;
    }

    public String dayName;
    public String temp;

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}
