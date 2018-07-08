package com.example.admin.myapplicationjhk.retrofit;

import com.example.admin.myapplicationjhk.model.WeatherCommon;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServerApi {
    @GET("/forecast/361529cbc327cfb9f426fed8464b63a9/42.3601,-71.0589?exclude=currently,minutely,hourly,alerts,flags/")
    Call<WeatherCommon>getWeather();

 }
