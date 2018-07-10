package com.example.admin.myapplicationjhk;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.admin.myapplicationjhk.model.DBManager;
import com.example.admin.myapplicationjhk.model.MVPModel;
import com.example.admin.myapplicationjhk.model.MVPModelImpl;

public class ActivityExtraWeather extends Activity implements MVPView {

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

    @Override
    public void setData(String[] notificationbyDayName) {
        if (notificationbyDayName.length < 6) throw new RuntimeException("Check your array");
        textViewDay.setText("Day  " + notificationbyDayName[0]);
        textViewapparentTemperatureHigh.setText("apparentTemperatureHigh  " + notificationbyDayName[1]);
        textViewapparentTemperatureLow.setText("apparentTemperatureLow  " + notificationbyDayName[2]);
        textViewCloudCover.setText("CloudCover  " + notificationbyDayName[3]);
        textViewPressure.setText("Pressure  " + notificationbyDayName[4]);
        textViewTemperature.setText("Temperature  " + notificationbyDayName[5]);
    }

    private void init() {
        textViewDay = findViewById(R.id.day);
        textViewapparentTemperatureHigh = findViewById(R.id.appTempHigh);
        textViewapparentTemperatureLow = findViewById(R.id.appTempLow);
        textViewCloudCover = findViewById(R.id.appCloudCover);
        textViewPressure = findViewById(R.id.pressure);
        textViewTemperature = findViewById(R.id.temperature);
        String dayOfWeek = getIntent().getStringExtra("dayOfWeek");
        DBManager dbManager = new DBManager(getApplicationContext());
        MVPModel usersModel = new MVPModelImpl(dbManager);
        MVPPresenter presenter = new MVPPresenterImpl(usersModel);
        presenter.attachView(this);
        presenter.loadWeather(dayOfWeek);
    }

}
