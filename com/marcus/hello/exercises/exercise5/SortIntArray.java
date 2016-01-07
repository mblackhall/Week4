package com.marcus.hello.exercises.exercise5;

import java.util.Arrays;

/**
 * @author marcus
 */
public class SortIntArray {


    public static void main(String[] args) {

        SortIntArray sortIntArray = new SortIntArray();

        int[] salary = {1000, 500, 400, 200, 2000};
        sortInts(salary);
        sortIntArray.printArray(salary);

        int [] salary2 = {4000, 300, 400, 100, 5000};
        Arrays.sort(salary2);
        sortIntArray.printArray(salary2);


    }

    private static void sortInts( int[] salary) {

        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < salary.length - 1; i++) {
                if (salary[i] > salary[i + 1]) {
                    temp = salary[i];
                    salary[i] = salary[i + 1];
                    salary[i + 1] = temp;
                    sorted = false;
                }
            }

        }

    }

    private void  printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.print("\n");
    }

}
