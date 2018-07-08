package com.example.admin.myapplicationjhk.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHelper {
    public static final String BASE_URL = "https://api.darksky.net";


    public ServerApi getService() {
        Gson gson = new GsonBuilder().setLenient().create();
        Retrofit build = new Retrofit.Builder().baseUrl(BASE_URL).
                addConverterFactory(GsonConverterFactory.create(gson)).build();
        return build.create(ServerApi.class);

    }

}
