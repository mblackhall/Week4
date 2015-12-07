package com.marcus.hello;

public class HelloWorld {

       public static void main( String args [] ) {

            if ( args == null || args.length == 0 ){

              System.out.println("Must supply an argument" );
              System.exit(0);
            }

            System.out.println("Hello " + args[0]);
            int lastSquare = 10;

       }



}
