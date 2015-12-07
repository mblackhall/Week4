package com.marcus.hello.math;

/**
 * @author marcus
 */

public class MathsUtils {

    public static final int sumofSquares(int upTo){
        int sum =0;
        for (int i=1;i<=upTo;i++){

            sum+=i*i;

        }
        return sum;

    }

}
