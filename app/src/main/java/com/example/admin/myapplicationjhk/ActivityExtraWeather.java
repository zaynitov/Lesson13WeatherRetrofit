package com.example.admin.myapplicationjhk;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.admin.myapplicationjhk.model.DBManager;

public class ActivityExtraWeather extends Activity {

    private TextView textViewDay;
    private TextView textViewapparentTemperatureHigh;
    private TextView textViewapparentTemperatureLow;
    private TextView textViewCloudCover;
    private TextView textViewPressure;
    private TextView textViewTemperature;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityextraweather);
        init();

    }

    private void init() {
        String dayOfWeekWithTemp = getIntent().getStringExtra("dayOfWeek");
        String dayOfWeek = dayOfWeekWithTemp.substring(0, dayOfWeekWithTemp.indexOf(" "));
        String[] notificationbyDayName = new DBManager(getApplicationContext()).getWeatherByDayName(dayOfWeek);
        textViewDay = findViewById(R.id.day);
        textViewapparentTemperatureHigh = findViewById(R.id.appTempHigh);
        textViewapparentTemperatureLow = findViewById(R.id.appTempLow);
        textViewCloudCover = findViewById(R.id.appCloudCover);
        textViewPressure = findViewById(R.id.pressure);
        textViewTemperature = findViewById(R.id.temperature);
        textViewDay.setText("Day  " + notificationbyDayName[0]);
        textViewapparentTemperatureHigh.setText("apparentTemperatureHigh  " + notificationbyDayName[1]);
        textViewapparentTemperatureLow.setText("apparentTemperatureLow  " + notificationbyDayName[2]);
        textViewCloudCover.setText("CloudCover  " + notificationbyDayName[3]);
        textViewPressure.setText("Pressure  " + notificationbyDayName[4]);
        textViewTemperature.setText("Temperature  " + notificationbyDayName[5]);
    }

}
