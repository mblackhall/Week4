package com.marcus.hello.exercises.strategy;

/**
 * @author marcus
 */
public class ProductOfNumbers implements Strategy {
    @Override
    public int executeAlgorithm(int x, int y) {
        return x * y;
    }
}
