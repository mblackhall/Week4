package com.marcus.hello.varargs;

/**
 * @author marcus
 */
public class DemoVarArgs {



    public static int sumInts(int... numbers){


        int sum = 0;
        for(int number:numbers){
            sum+= number;
        }
        return sum;
    }


    public static void main(String... args) {

        System.out.println(sumInts(5,4,5,7,8,9,8));

        int age =  16;

        String permitted = (age == 16) ?  "not permitted" : "permitted";




    }

}
