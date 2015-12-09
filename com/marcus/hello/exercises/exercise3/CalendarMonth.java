package com.marcus.hello.exercises.exercise3;

import sun.util.calendar.JulianCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * @author marcus
 * writes out given a year and month the calendar to the console
 */
public class CalendarMonth {

    private int  month;
    private int year;


    public CalendarMonth(int year,int month){
        this.year = year;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }


    public String getDayOfMonth(){
        Calendar calendar = Calendar.getInstance();



        calendar.set(year,Calendar.DECEMBER,8);

        Locale locale = Locale.getDefault();
        calendar.get(Calendar.DAY_OF_MONTH);
        calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,locale);
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,locale);

    }

}
