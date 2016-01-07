package com.marcus.hello.exercises.exercise4;

import junit.framework.TestCase;

/**
 * @author marcus
 */
public class FibonacciTest extends TestCase {

    public void testPrintFibonacciSequence() throws Exception {

        Fibonacci.printFibonacciSequence(1);
        Fibonacci.printFibonacciSequence(3);
        Fibonacci.printFibonacciSequence(10);

    }
}