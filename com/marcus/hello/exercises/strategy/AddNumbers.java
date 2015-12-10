package com.marcus.hello.exercises.strategy;

/**
 * @author marcus
 */
public class AddNumbers implements Strategy {
    @Override
    public int executeAlgorithm(int x, int y) {
        return x +y;
    }
}
