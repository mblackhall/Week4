package com.marcus.hello.exercises.exercise3;

import junit.framework.TestCase;

/**
 * @author marcus
 */
public class CalendarMonthTest extends TestCase {

    public void testGetMonth()  {

        new CalendarMonth(2015,12).getDayOfMonth();
    }
}