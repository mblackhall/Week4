package com.marcus.hello.exercises.exercise1;

import com.marcus.hello.utils.StringUtils;

/**
 * @author marcus
 */
 public final class ReverseString {

    /**
     * Prints the reverse of a String
     * @param text (String to reverse)
     */
    private static void reverseString(String text) {

        if (StringUtils.isEmpty(text)) return;

        for (int i= text.length() -1;i >= 0; i--){
            System.out.print(text.charAt(i));
        }

    }


    public static void main(String[] args) {

        if ( args.length == 0 ){
            System.out.println("Provide strings to reverse");
            System.exit(0);
        }

        for (String stringToReverse : args) {
            System.out.println("\nReversing string ... " + stringToReverse);
            reverseString(stringToReverse);
        }

    }


}
