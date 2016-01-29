package com.marcus.hello.inheritance;

import com.marcus.hello.model.Car;
import com.marcus.hello.model.Vehicle;

/**
 * @author marcus
 */
public class ViewVehicles {

    public static void main(String[] args) {


        Vehicle v1 = new Car();
        v1.getSpeed();
        v1.start();


    }


}
