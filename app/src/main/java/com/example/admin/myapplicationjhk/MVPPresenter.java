package com.example.admin.myapplicationjhk;

public interface MVPPresenter<T extends MVPView> {
     void attachView(T mvpView);
     void loadWeather(String dayOfWeek);
}
