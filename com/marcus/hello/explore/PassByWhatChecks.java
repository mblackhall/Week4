package com.marcus.hello.explore;

import com.marcus.hello.model.Student;

/**
 * @author marcus
 */
public class PassByWhatChecks {


    public static void main(String[] args) {

        int counter = 6;

        //  examine change of prmitive parameter
        System.out.println("counter before = " + counter);
        changeCounter(6);
        System.out.println("counter after = " + counter);


        String comment = new String("Git is cool");
        System.out.println("\nComment before = " + comment);
        changeComment(comment);
        System.out.println("Comment after = " + comment);


        Student student = new Student("Tom", 15);
        System.out.println("\nStudent score before = " + student.getScore());
        changeScore(student);
        System.out.println("Student score after = " + student.getScore());


        Student student2 = new Student("John", 70);
        System.out.println("\nStudent score before = " + student2.getScore());
        changeStudentScore(student2);
        System.out.println("Student score after = " + student2.getScore());

        Student student3 = new Student("Fred", 40);
        System.out.println("\nStudent score before = " + student3.getName() + ":" +  student3.getScore());
        changeStudentScoreComplicated(student3);
        System.out.println("Student score after = " + student3.getName() + ":" +  student3.getScore());


    }

    private static void changeCounter(int counter) {

        counter =  10;

    }

    private static void changeComment(String comment) {
        comment = "No it doesn't";

    }


    private static void changeScore(Student student) {

        student.setScore(100);

    }

    private static void changeStudentScore(Student student2) {

        Student student3 = new Student("george",6);
        student2 = student3;

    }

    private static void changeStudentScoreComplicated(Student student3) {

        student3.setScore(90);

        student3 = new Student("Arnie", 10);



    }







}
