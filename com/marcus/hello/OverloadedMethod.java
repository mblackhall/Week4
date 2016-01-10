package com.marcus.hello;

/**
 * @author marcus
 */
public class OverloadedMethod {


     int sumValues(int a,int b){
        return a +b;
    }

    double sumValues(double a,double b){
        return a +b;
    }


    public static void main(String[] args) {
        OverloadedMethod om = new OverloadedMethod();
        System.out.println(om.sumValues(4,5));
        System.out.println(om.sumValues(4.0,5.1));
    }


}
