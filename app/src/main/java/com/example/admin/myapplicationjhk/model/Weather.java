package com.example.admin.myapplicationjhk.model;

import com.example.admin.myapplicationjhk.helpers.ConvertorFarenheitToCelcius;
import com.google.gson.annotations.SerializedName;

public class Weather {

    @SerializedName("time")
    private Integer time;
    @SerializedName("icon")
    private String icon;
    @SerializedName("temperatureHigh")
    private Double temperatureHigh;
    @SerializedName("temperatureLow")
    private Double temperatureLow;
    @SerializedName("apparentTemperatureHigh")
    private Double apparentTemperatureHigh;
    @SerializedName("apparentTemperatureLow")
    private Double apparentTemperatureLow;
    @SerializedName("pressure")
    private Double pressure;
    @SerializedName("cloudCover")
    private Double cloudCover;
    @SerializedName("visibility")
    private Integer visibility;

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Double getTemperatureHigh() {
        return ConvertorFarenheitToCelcius.convertFarToCelc(temperatureHigh);
    }

    public void setTemperatureHigh(Double temperatureHigh) {
        this.temperatureHigh = temperatureHigh;
    }

    public Double getTemperatureLow() {
        return ConvertorFarenheitToCelcius.convertFarToCelc(temperatureLow);
    }

    public void setTemperatureLow(Double temperatureLow) {
        this.temperatureLow = temperatureLow;
    }


    public Double getApparentTemperatureHigh() {
        return ConvertorFarenheitToCelcius.convertFarToCelc(apparentTemperatureHigh);
    }

    public void setApparentTemperatureHigh(Double apparentTemperatureHigh) {
        this.apparentTemperatureHigh = apparentTemperatureHigh;
    }


    public Double getApparentTemperatureLow() {
        return ConvertorFarenheitToCelcius.convertFarToCelc(apparentTemperatureLow);
    }

    public void setApparentTemperatureLow(Double apparentTemperatureLow) {
        this.apparentTemperatureLow = apparentTemperatureLow;
    }


    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }


    public Double getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(Double cloudCover) {
        this.cloudCover = cloudCover;
    }


    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }


}


