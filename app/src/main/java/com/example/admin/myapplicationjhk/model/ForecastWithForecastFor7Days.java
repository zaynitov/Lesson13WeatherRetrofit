package com.example.admin.myapplicationjhk.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ForecastWithForecastFor7Days {
    @SerializedName("data")
    private List<Weather> weatherList;

    public List<Weather> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<Weather> weatherList) {
        this.weatherList = weatherList;
    }

}
