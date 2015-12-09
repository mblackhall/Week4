package com.marcus.hello.exercises.exercise4;

import junit.framework.TestCase;

/**
 * @author marcus
 */
public class FactorialTest extends TestCase {

    public void testFactorial()  {

        assertEquals(1,Factorial.factorial(0));
        assertEquals(1,Factorial.factorial(1));
        assertEquals(-1,Factorial.factorial(-5));
        assertEquals(6,Factorial.factorial(3));
        assertEquals(120,Factorial.factorial(5));

    }

    public void testRecursiveFactorial()  {

        assertEquals(1,Factorial.recursiveFactorial((0)));
        assertEquals(1,Factorial.recursiveFactorial(1));
        assertEquals(-1,Factorial.recursiveFactorial(-5));
        assertEquals(6,Factorial.recursiveFactorial(3));
        assertEquals(120,Factorial.recursiveFactorial(5));

    }



}