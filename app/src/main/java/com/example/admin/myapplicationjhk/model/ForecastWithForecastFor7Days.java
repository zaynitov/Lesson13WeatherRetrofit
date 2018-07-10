package com.example.admin.myapplicationjhk.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class ForecastWithForecastFor7Days {
    @SerializedName("data")
    private List<Weather> weatherList;

    public List<Weather> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<Weather> weatherList) {
        this.weatherList = weatherList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForecastWithForecastFor7Days)) return false;

        ForecastWithForecastFor7Days that = (ForecastWithForecastFor7Days) o;

        return getWeatherList().equals(that.getWeatherList());
    }

    @Override
    public int hashCode() {
        return getWeatherList().hashCode();
    }

    @Override
    public String toString() {
        return "ForecastWithForecastFor7Days{" +
                "weatherList=" + weatherList +
                '}';
    }
}
