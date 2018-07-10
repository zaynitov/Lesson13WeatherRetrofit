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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weather)) return false;

        Weather weather = (Weather) o;

        if (getTime() != null ? !getTime().equals(weather.getTime()) : weather.getTime() != null)
            return false;
        if (getIcon() != null ? !getIcon().equals(weather.getIcon()) : weather.getIcon() != null)
            return false;
        if (getTemperatureHigh() != null ? !getTemperatureHigh().equals(weather.getTemperatureHigh()) : weather.getTemperatureHigh() != null)
            return false;
        if (getTemperatureLow() != null ? !getTemperatureLow().equals(weather.getTemperatureLow()) : weather.getTemperatureLow() != null)
            return false;
        if (getApparentTemperatureHigh() != null ? !getApparentTemperatureHigh().equals(weather.getApparentTemperatureHigh()) : weather.getApparentTemperatureHigh() != null)
            return false;
        if (getApparentTemperatureLow() != null ? !getApparentTemperatureLow().equals(weather.getApparentTemperatureLow()) : weather.getApparentTemperatureLow() != null)
            return false;
        if (getPressure() != null ? !getPressure().equals(weather.getPressure()) : weather.getPressure() != null)
            return false;
        if (getCloudCover() != null ? !getCloudCover().equals(weather.getCloudCover()) : weather.getCloudCover() != null)
            return false;
        return getVisibility() != null ? getVisibility().equals(weather.getVisibility()) : weather.getVisibility() == null;
    }

    @Override
    public int hashCode() {
        int result = getTime() != null ? getTime().hashCode() : 0;
        result = 31 * result + (getIcon() != null ? getIcon().hashCode() : 0);
        result = 31 * result + (getTemperatureHigh() != null ? getTemperatureHigh().hashCode() : 0);
        result = 31 * result + (getTemperatureLow() != null ? getTemperatureLow().hashCode() : 0);
        result = 31 * result + (getApparentTemperatureHigh() != null ? getApparentTemperatureHigh().hashCode() : 0);
        result = 31 * result + (getApparentTemperatureLow() != null ? getApparentTemperatureLow().hashCode() : 0);
        result = 31 * result + (getPressure() != null ? getPressure().hashCode() : 0);
        result = 31 * result + (getCloudCover() != null ? getCloudCover().hashCode() : 0);
        result = 31 * result + (getVisibility() != null ? getVisibility().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "time=" + time +
                ", icon='" + icon + '\'' +
                ", temperatureHigh=" + temperatureHigh +
                ", temperatureLow=" + temperatureLow +
                ", apparentTemperatureHigh=" + apparentTemperatureHigh +
                ", apparentTemperatureLow=" + apparentTemperatureLow +
                ", pressure=" + pressure +
                ", cloudCover=" + cloudCover +
                ", visibility=" + visibility +
                '}';
    }
}


