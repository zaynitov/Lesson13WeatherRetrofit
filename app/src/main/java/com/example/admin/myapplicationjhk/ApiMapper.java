package com.example.admin.myapplicationjhk;

import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiMapper {
    private RetrofitHelper helper;

    public ApiMapper(RetrofitHelper helper) {
        this.helper = helper;
    }


    public void authAsync() {
        helper.getService().getWeather().enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                System.out.println(response.body());
                Log.v("Response", "[ImageLoader:loadFile]: Opening file...");

            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {

            }
        });
    }


}
