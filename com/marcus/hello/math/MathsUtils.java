package com.marcus.hello.math;

/**
 * @author marcus
 */

public class MathsUtils {

    public static int sumofSquares(int upTo) {

        if (upTo < 1) {
            throw new IllegalArgumentException("Postive integer > 0 is required");
        }

        int sum = 0;
        for (int i = 1, j = 2; i <= upTo; i++) {
            sum += i * i;
        }
        return sum;

    }

}
