package com.example.admin.myapplicationjhk.retrofit;

import com.example.admin.myapplicationjhk.model.WeatherCommon;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ServerApi {
    @GET("/forecast/{token}/{coordinates}")
    Call<WeatherCommon>getWeather(@Path("token") String token, @Path("coordinates") String coordinates);
 }
