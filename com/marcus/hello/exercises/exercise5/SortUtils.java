package com.marcus.hello.exercises.exercise5;

import com.marcus.hello.model.ComparableStudent;
import com.marcus.hello.model.Student;

import java.util.Arrays;

/**
 * @author marcus
 */
public class SortUtils {


    public static void main(String[] args) {

        SortUtils sortUtils = new SortUtils();

        int[] salary = {1000, 500, 400, 200, 2000};
        sortInts(salary);
        sortUtils.printArray(salary);

        int [] salary2 = {4000, 300, 400, 100, 5000};
        Arrays.sort(salary2);
        sortUtils.printArray(salary2);


    }

    private static void sortInts( int[] salary) {

        boolean sorted = false;
        int i,temp;
        while (!sorted) {
            sorted = true;
            for ( i = 0; i < salary.length - 1; i++) {
                if (salary[i] > salary[i + 1]) {
                    temp = salary[i];
                    salary[i] = salary[i + 1];
                    salary[i + 1] = temp;
                    sorted = false;
                }
            }

        }

    }

    public static void sortStudents(Student[] students){

        assert students != null;

        boolean sorted = false;
        int lastButOneIndex = students.length -1;
        int i;
        Student temp;
        while (!sorted) {
            sorted = true;
            for ( i = 0; i < lastButOneIndex; i++) {
                if (students[i].getScore() > students[i+1].getScore()) {
                    temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    sorted = false;
                }
            }

        }



    }

    public static void sortStudents(Student[] students, ComparableStudent compare){

        boolean sorted = false;
        Student temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < students.length - 1; i++) {
                if ( compare.compareStudent(students[i],students[i+1]) > 0 ) {
                    temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
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
