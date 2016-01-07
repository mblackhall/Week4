package com.marcus.hello.math;

/**
 * @author marcus
 */
public class SumIntegers {

    public static long sumIntegers(int... values) {
        long sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }
}