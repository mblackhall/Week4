package com.marcus.hello.com.marcus.hello.inheritance;

import com.marcus.hello.model.Car;
import com.marcus.hello.model.Vehicle;

import java.util.*;

/**
 * @author marcus
 */
public class ViewVehicles {

    public static void main(String[] args) {
        List<Currency> cur = new ArrayList<>();

        cur.addAll(Currency.getAvailableCurrencies());


        Collections.sort(cur, new Comparator<Currency>() {
            @Override
            public int compare(Currency o1, Currency o2) {
                return o1.getDisplayName().compareTo(o2.getDisplayName());
            }
        });
        for (Currency currency : cur) {

            System.out.println( currency.getCurrencyCode() + " : " +
                    currency.getDisplayName() + " : " + currency.getSymbol());


        }

        Vehicle v1 = new Vehicle();

        Car c1 = new Car();

        Vehicle v2 = new Car();
        v1.start();
        v2.start();
        c1.start();

       Locale l = new Locale("");


    }


}
