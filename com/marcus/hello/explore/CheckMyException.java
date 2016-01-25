package com.marcus.hello.explore;

import com.marcus.hello.exceptions.types.PostCodeInvalidException;

/**
 * @author marcus
 */
public class CheckMyException {


    public static void method1() throws PostCodeInvalidException {
   throw new PostCodeInvalidException("post code invalid");

    }

    public static  void  method2 (){
        try {
            method1();


        } catch (PostCodeInvalidException e) {
        System.out.println("I handled it");
        } catch ( Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        method2();
    }

}