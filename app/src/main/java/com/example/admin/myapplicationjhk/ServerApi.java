package com.example.admin.myapplicationjhk;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

public interface ServerApi {
    @Headers({"Content type:applycation/json"})
    @GET("getWeather")
    Call<List<Weather>> getWeather();

 }
