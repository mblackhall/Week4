package com.marcus.hello.math;

import junit.framework.TestCase;

/**
 * @author marcus
 */
public class MathsUtilsTest extends TestCase {

    public void testSumofSquares()  {

        assertEquals(14,MathsUtils.sumofSquares(3));

    }

    public void testShouldThrowException(){
        boolean error = false;
        try {
            MathsUtils.sumofSquares(-1);
        } catch(IllegalArgumentException iae){
            assertEquals("Postive integer > 0 is required",iae.getMessage());
            error = true;
        } finally {
            if (! error ){
                fail();
            }
        }
    }
}