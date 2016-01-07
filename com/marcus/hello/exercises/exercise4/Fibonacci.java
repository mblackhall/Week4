package com.marcus.hello.exercises.exercise4;

/**
 * @author marcus
 * Fibonacci sequence is 0,1,1,2,3,5,8,13,21 etc
 */
public class Fibonacci {
    /**
     *
     * @param noOfEntries no. of entries in fibonacci sequence to print
     * @return the fibonacci sequence
     */

    private static final String COMMA = ",";

    public static void printFibonacciSequence(int noOfEntries){

        assert(noOfEntries> 0);   // java 7 feature

        int prevFibo = 0;
        System.out.print("\n" + prevFibo);
        int noPrinted = 1;
        if (noOfEntries == 1) {
            return;
        }

        int currFibo = 1;
        int temp = currFibo;
        System.out.print(COMMA + temp);
        noPrinted++;

        while ( noPrinted < noOfEntries ) {

            temp = currFibo + prevFibo;
            prevFibo= currFibo;
            currFibo = temp;
            System.out.print(COMMA + temp);
            noPrinted++;


        }

    }

    public static void main(String[] args) {

        if ( args.length != 1 ){
            System.out.println("Must provide an integer as argument");
            System.exit(0);
        }

        Fibonacci.printFibonacciSequence(Integer.parseInt(args[0]));


    }
}
