package com.marcus.hello.exam;

import com.marcus.hello.exercises.exercise5.SortUtils;
import com.marcus.hello.model.Student;

/**
 * @author marcus
 */
public class StudentExamScores {

    private Student[] students;

    public StudentExamScores() {
        initScores();
    }

    private void initScores() {

        Student student5 = new Student("Marcus", 85.6);
        Student student2 = new Student("Tom", 10.0);
        Student student3 = new Student("Fred", 15.5);
        Student student4 = new Student("Ruud", 16.5);
        Student student1 = new Student("John", 100.0);
        students = new Student[]{student1, student2, student3, student4, student5};

    }


    public void reportStudentScores() {

        SortUtils.sortStudents(students);

        System.out.format("%-12s %-12s %n", "Name", "Score");
        System.out.format("%-12s %-12s %n", "------------", "------");

        for (Student student : students) {

            System.out.format("%-12s %6.2f%n", student.getName(), student.getScore());
        }

    }

    public static void main(String[] args) {
        StudentExamScores studentExamScores = new StudentExamScores();
        studentExamScores.reportStudentScores();

    }

}
