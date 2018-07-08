package com.example.admin.myapplicationjhk;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHelper {
    public static final String VERSION_API = "2.5/";
    public static final String BASE_URL = "api.openweathermap.org/data/" + VERSION_API+"forecast?id=524901";


    public ServerApi getService() {
        Gson gson = new GsonBuilder().setLenient().create();

        Retrofit build = new Retrofit.Builder().baseUrl("https://api.gismeteo.ru/v2/weather/forecast/4368/?days=1").
                addConverterFactory(GsonConverterFactory.create(gson)).build();
        return build.create(ServerApi.class);
R.id
    }

}
