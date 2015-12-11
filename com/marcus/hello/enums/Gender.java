package com.marcus.hello.enums;

/**
 * @author marcus
 */
public enum Gender {
    MALE('M') ,
    FEMALE('F');

    private char gender;

    public char getGender() {
        return gender;
    }


    Gender(char gender){
        this.gender = gender;
    }


}
