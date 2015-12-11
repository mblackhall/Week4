package com.marcus.hello.exercises.exercise1;

import java.io.Console;
import java.util.Scanner;


import static java.lang.System.out;

/**
 * @author marcus
 *         Echo what was input in the console
 */
public class Echo {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "end";
        while ( scanner.hasNext() ){
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            // echo the line
            out.println(" Echoing ..." + input);

        }
        scanner.close();

    }
}
