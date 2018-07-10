package com.example.admin.myapplicationjhk.model;

public class MVPModelImpl implements MVPModel {
    private DBManager dbManager;

    public MVPModelImpl(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    @Override
    public String[] getData(String dayOfWeek) {
        return dbManager.getWeatherByDayName(dayOfWeek);
    }
}
