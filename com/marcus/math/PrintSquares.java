package com.marcus.math;

/**
 * Created by marcus on 12/7/15.
 */
public class PrintSquares {

    public static void main(String args []){


            printSquares(10);

    }



        private static void  printSquares(int lastSquare){

            for (int i=1;i<= 10 ;i++) {
                System.out.printf("%3d%4d\n",i,i*i);
            }
        }




}
