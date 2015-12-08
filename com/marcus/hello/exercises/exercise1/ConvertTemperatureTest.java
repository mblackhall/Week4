package com.marcus.hello.exercises.exercise1;

import junit.framework.TestCase;

/**
 * @author marcus
 */
public class ConvertTemperatureTest extends TestCase {


    public void testConvertCelciusToFahrenheit()  {

        assertEquals(32d,ConvertTemperature.convertCelciusToFahrenheit(0));
        assertEquals(104d,ConvertTemperature.convertCelciusToFahrenheit(40));

    }

    public void testConvertFahrenheitToCelcius()  {

        assertEquals(0d,ConvertTemperature.convertFahrenheitToCelcius(32));
        assertEquals(40d,ConvertTemperature.convertFahrenheitToCelcius(104d));

    }
}