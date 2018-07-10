package com.example.admin.myapplicationjhk;

import com.example.admin.myapplicationjhk.model.MVPModel;

public class MVPPresenterImpl<T extends MVPView> implements MVPPresenter<T> {

    private MVPView view;
    private MVPModel MVPModel;

    public MVPPresenterImpl(MVPModel MVPModel) {
        this.MVPModel = MVPModel;
    }

    @Override
    public void attachView(T mvpView) {
        this.view = mvpView;
    }

    @Override
    public void loadWeather(String dayOfWeek) {
        view.setData(MVPModel.getData(dayOfWeek));
    }
}

