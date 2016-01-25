package com.marcus.hello.explore.commands;

/**
 * @author marcus
 */
public class ListStudentsSql extends TransactionClosure {


    @Override
    public void action() {
        System.out.println("List Students sql code");
    }
}
