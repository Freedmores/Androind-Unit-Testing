package com.sidume.freedmores.temperatureconverter;

public class ConverterUtil {

    //convert to celsius
    public  static float convertFahrenheitToCelcius(float fahrenheit){
        return ((fahrenheit - 32) * 5/9);
    }

    //converts to fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius){
        return ((celsius * 9) / 5) + 32;
    }
}
