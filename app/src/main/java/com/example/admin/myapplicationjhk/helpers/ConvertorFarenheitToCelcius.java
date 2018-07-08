package com.example.admin.myapplicationjhk.helpers;

public class ConvertorFarenheitToCelcius {
    public static Double convertFarToCelc(Double fahrenheit) {
        return ((5.0 / 9.0) * (fahrenheit - 32.0));
    }
}
