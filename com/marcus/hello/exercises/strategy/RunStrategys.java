package com.marcus.hello.exercises.strategy;

/**
 * @author marcus
 */
public class RunStrategys {


    public static void main(String[] args) {

        Context productOfNumbers  = new Context(new ProductOfNumbers());
        Context addNumbers = new Context(new AddNumbers());

        System.out.println("Product : " + productOfNumbers.executeStrategy(5,6));
        System.out.println("Sum    : " + addNumbers.executeStrategy(5,6));

    }


}
