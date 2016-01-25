package com.marcus.hello.explore.commands;

/**
 * @author marcus
 */
public class CreateStudentSql extends TransactionClosure {


    @Override
    public void action() {

        System.out.println("Code to add a student with JDBC");
    }
}
