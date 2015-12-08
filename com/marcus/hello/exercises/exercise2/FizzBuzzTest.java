package com.marcus.hello.exercises.exercise2;

import junit.framework.TestCase;

/**
 * @author marcus
 */
public class FizzBuzzTest extends TestCase {

    private FizzBuzz fizzBuzz = new FizzBuzz();
    protected void setUp(){
        fizzBuzz = new FizzBuzz();

    }

    public void testFizzBuzzShouldBeFizz() throws Exception {

        assertEquals("Fizz",fizzBuzz.getFizzBuzz(9));
        assertEquals("Fizz",fizzBuzz.getFizzBuzz(99));


    }

    public void testFizzBuzzShouldBeBuzz()  {

        assertEquals("Buzz",fizzBuzz.getFizzBuzz(5));
        assertEquals("Buzz",fizzBuzz.getFizzBuzz(20));

    }

    public void testFizzBuzzShouldBeFizzBuzz()  {

        assertEquals("FizzBuzz",fizzBuzz.getFizzBuzz(15));
        assertEquals("FizzBuzz",fizzBuzz.getFizzBuzz(30));


    }

    public void testFizzBuzzShouldBeNumber()  {

        assertEquals("4",fizzBuzz.getFizzBuzz(4));
        assertEquals("98",fizzBuzz.getFizzBuzz(98));


    }

}