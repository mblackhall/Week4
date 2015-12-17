package com.marcus.hello.exercises.exercise1;

/**
 * @author marcus
 */
public class ReverseString {


    public static void main(String[] args) {
            reverseString("Write me backwards");
    }

    private static void reverseString(String arg) {
        if (arg.isEmpty()) return;
        int start = arg.length() -1;
        for (int i=start;i >= 0; i--){

            System.out.print(arg.charAt(i));
        }

    }


}
