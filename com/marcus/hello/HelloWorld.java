package com.marcus.hello;

public class HelloWorld {

    public static void main(String... args) {

        if ( args.length == 0) {

            System.out.println("Must supply an argument");
            System.exit(0);
        }

        new HelloWorld().printArguments(args);


    }

    private void printArguments(String... args) {

        System.out.print("Hello ..." );
        for (String argument : args) {
            System.out.print(" " + argument);
        }

    }


}
