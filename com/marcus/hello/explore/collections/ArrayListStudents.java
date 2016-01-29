package com.marcus.hello.explore.collections;

import com.marcus.hello.model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marcus
 */
public class ArrayListStudents {


    public static void main(String[] args) {

        List objects = new ArrayList();


        List<Student> students = new ArrayList<>();

        students.add(new Student("fred",34));
        students.add(new Student("ben",34));
        students.add(new Student("maia",80));


        students.remove(2);

        students.add(0,new Student("george",50));



        // .... show enhanced for loopreturn 0;

        for (Student s : students){
            System.out.println(s.getName() + " : " + s.getScore());
        }



    }
}
