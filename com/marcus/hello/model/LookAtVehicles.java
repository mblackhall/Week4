package com.marcus.hello.model;

/**
 * @author marcus
 */
public class LookAtVehicles {

    public static void main(String[] args) {

        Car car = new Car();
        Vehicle  v2 = new Car();
        v2.brake();
        Vehicle v3 = new Bicycle();
        Bicycle castBicycle = (Bicycle) v3;
        if (v3 instanceof Bicycle) {
            System.out.println("i am a bike");
        }


    }

}
