package com.marcus.hello.explore;

import com.marcus.hello.model.Student;

/**
 * @author marcus
 */
public class StudentIsAnObject {

Object o ;
    public static void main(String[] args) {

        Student student1 = new Student("fred",10);
        Student student2 = new Student("fred", 10);

        Object o = student1;



        String s1 ;

        System.out.println("where did this method come from");

        if (student1.equals(student2)){
            System.out.println("they are equal");
        } else {
            System.out.println( "they are not equal");
        }

    }
}
