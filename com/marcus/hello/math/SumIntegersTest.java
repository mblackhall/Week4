package com.marcus.hello.math;

import junit.framework.TestCase;

/**
 * @author marcus
 */
public class SumIntegersTest extends TestCase {

    public void testSumIsCorrect()  {
        assertEquals(18,SumIntegers.sumIntegers(5,6,7));
    }
}