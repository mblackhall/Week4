package com.marcus.hello.exercises.exercise3;

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




}
