package com.marcus.hello.explore;

import java.util.Arrays;

/**
 * @author marcus
 */
public class JavaArrays {


    public static void main(String[] args) {


        String [] names = {"Tom cobbly","Ruud Bloem"};
        for (String name : names ){

            System.out.println(name);
        }


        int i = 0;
        // ternary

        boolean invalid = i == 0 ? true :false;

        int[][] points = new int[5][];
        points[0] = new int[]{11, 5, 4};
        points[1] = new int[]{5, 4};



        int bb[][] = new int[5][];

        String x = "123456";
        StringBuilder sb = new StringBuilder(x);

        System.out.println(sb);
        System.arraycopy(points, 0, bb, 0, 5);
        System.out.println(Arrays.toString(bb));

        System.out.println(Arrays.toString(points[0]));
        int[][] h = Arrays.copyOf(points, 2);

    }
}


