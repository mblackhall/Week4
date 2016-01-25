package com.marcus.hello.exam;

import com.marcus.hello.model.ComparableStudent;
import com.marcus.hello.model.Student;

/**
 * @author marcus
 */
public class SotByScores   implements ComparableStudent {

    @Override
    public int compareStudent(Student s1, Student s2) {
        if ( s1.getScore() < s2.getScore()){
            return -1;}
            else {
            return 1;
        }

    }
}
