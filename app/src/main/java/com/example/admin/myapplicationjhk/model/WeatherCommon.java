package com.example.admin.myapplicationjhk.model;

import com.google.gson.annotations.SerializedName;

public class WeatherCommon {
    @SerializedName("daily")
    private ForecastWithForecastFor7Days forecastWithForecastFor7Days;

    public ForecastWithForecastFor7Days getForecastWithForecastFor7Days() {
        return forecastWithForecastFor7Days;
    }

    public void setForecastWithForecastFor7Days(ForecastWithForecastFor7Days forecastWithForecastFor7Days) {
        this.forecastWithForecastFor7Days = forecastWithForecastFor7Days;
    }
}
