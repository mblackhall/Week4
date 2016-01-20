package com.marcus.hello.model;

/**
 * @author marcus
 */
public class Car extends Vehicle {

    @Override
    public void brake() {
        System.out.println(" braking a car" );
    }

    public void start(){
        System.out.println(" Start car by turning key" );
    }
}
