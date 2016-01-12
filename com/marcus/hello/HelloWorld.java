package com.marcus.hello;

public class HelloWorld {

    interface HelloWorldGreeter {
            void greet(String message);
    }

    public static void main(String... args) {

        if ( args.length == 0) {

            System.out.println("Must supply an argument");
            System.exit(0);
        }

        new HelloWorld().printArguments(args);


    }

    private void printArguments(String... args) {

      final int i ;
        i =5;
        final String h = "aa";

        for (final String argument : args) {

            new HelloWorldGreeter() {


                @Override
                public void greet(String message) {
                    System.out.println("Hello " + argument + ":" +  message);
                }
            }.greet(argument);
        }

    }


}
