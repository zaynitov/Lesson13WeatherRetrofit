package com.example.admin.myapplicationjhk;

public class ApiMapper {
    private RetrofitHelper helper;

    public ApiMapper(RetrofitHelper helper) {
        this.helper = helper;
    }


    public void authAsync(String username, String password)
    {
        helper.getService().getWeather()
    }



}
