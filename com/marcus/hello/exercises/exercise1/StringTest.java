package com.marcus.hello.exercises.exercise1;

import junit.framework.TestCase;

/**
 * @author marcus
 */
public class StringTest extends TestCase {

    public void testString(){

        String  a = "blob";
        String b = "slob";
        String c = new String("blob");

        b  += "george";
        b.concat(a);
        int x = 3;
        int y = 4;
        System.out.println(x + y + " =" + x + y);

        //  a == c
        //



    }
}
