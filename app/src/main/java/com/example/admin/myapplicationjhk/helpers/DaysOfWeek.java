package com.example.admin.myapplicationjhk.helpers;

import java.util.Calendar;

public class DaysOfWeek {
   private static String daysArray[] = {"Sunday","Monday","Tuesday", "Wednesday","Thursday","Friday", "Saturday"};

    public static Integer getCurrentDayID(){
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        return day;
    }
    public static String getDayByID(int day){
        return daysArray[day];
    }
}

