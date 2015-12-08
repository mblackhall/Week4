package com.marcus.hello.exercises.exercise1;

/**
 * @author marcus
 */
public class ConvertTemperature {

    /**
     * @param temperature (in fahrenheit)
     * @return temperature in celcius
     */
    public static double convertFahrenheitToCelcius(double temperature) {

        return  (temperature -32 ) * 5 /9 ;

    }

    /**
     *
     * @param temperature in celcius
     * @return temperature in fahrenheit
     */
    public static double convertCelciusToFahrenheit(double temperature) {

        return temperature * 9 / 5 + 32;


    }

}
