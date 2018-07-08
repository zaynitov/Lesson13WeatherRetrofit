package com.example.admin.myapplicationjhk.retrofit;

import com.example.admin.myapplicationjhk.model.WeatherCommon;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiMapper {
    private RetrofitHelper helper;
    private WeatherCommon weatherList;

    public WeatherCommon getWeatherList() {
        return weatherList;
    }

    public ApiMapper(RetrofitHelper helper) {
        this.helper = helper;
    }


    public void authAsync() {
        helper.getService().getWeather().enqueue(new Callback<WeatherCommon>() {
            @Override
            public void onResponse(Call<WeatherCommon> call, Response<WeatherCommon> response) {
                weatherList = response.body();
            }

            @Override
            public void onFailure(Call<WeatherCommon> call, Throwable t) {
            }
        });
    }


}
