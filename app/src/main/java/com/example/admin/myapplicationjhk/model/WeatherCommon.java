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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WeatherCommon)) return false;

        WeatherCommon that = (WeatherCommon) o;

        return getForecastWithForecastFor7Days() != null ? getForecastWithForecastFor7Days().equals(that.getForecastWithForecastFor7Days()) : that.getForecastWithForecastFor7Days() == null;
    }

    @Override
    public int hashCode() {
        return getForecastWithForecastFor7Days() != null ? getForecastWithForecastFor7Days().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "WeatherCommon{" +
                "forecastWithForecastFor7Days=" + forecastWithForecastFor7Days +
                '}';
    }
}
