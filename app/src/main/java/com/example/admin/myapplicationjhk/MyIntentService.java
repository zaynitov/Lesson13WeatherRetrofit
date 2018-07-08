package com.example.admin.myapplicationjhk;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.os.ResultReceiver;

import com.example.admin.myapplicationjhk.helpers.DaysOfWeek;
import com.example.admin.myapplicationjhk.model.DBManager;
import com.example.admin.myapplicationjhk.model.Weather;
import com.example.admin.myapplicationjhk.retrofit.ApiMapper;
import com.example.admin.myapplicationjhk.retrofit.RetrofitHelper;

import java.util.ArrayList;
import java.util.List;

public class MyIntentService extends IntentService {
    public MyIntentService(String name) {
        super(name);
    }

    public MyIntentService() {
        super("SD");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        ArrayList<String> stringsWeatherPerDay = new ArrayList<String>();
        ApiMapper apiMapper = new ApiMapper(new RetrofitHelper());
        apiMapper.authAsync();

        while (apiMapper.getWeatherList() == null) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        List<Weather> weatherList = apiMapper.getWeatherList().getForecastWithForecastFor7Days().getWeatherList();
        DBManager dbManager = new DBManager(getApplicationContext());
        Integer DayID = DaysOfWeek.getCurrentDayID()-1;
        for (Weather weather : weatherList) {
            stringsWeatherPerDay.add(DaysOfWeek.getDayByID(DayID) +" " + String.valueOf(Math.round(weather.getTemperatureHigh())));
            dbManager.addWeather(DaysOfWeek.getDayByID(DayID), String.valueOf(Math.round(weather.getApparentTemperatureHigh())),
                    String.valueOf(Math.round( weather.getApparentTemperatureLow())),
                    String.valueOf(Math.round(weather.getCloudCover())),
                    String.valueOf(Math.round(weather.getPressure())),
                    String.valueOf(Math.round(weather.getTemperatureLow())));
            DayID = (DayID + 1) % 7;
        }

        ResultReceiver resultReceiver = intent.getParcelableExtra("receiverTag");
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("list", stringsWeatherPerDay);
        resultReceiver.send(0, bundle);

    }

    public static Intent getIntent(Context context) {
        return new Intent(context, MyIntentService.class);
    }
}
