package com.marcus.hello.explore.commands;

/**
 * @author marcus
 */
public abstract class TransactionClosure {

    public void runCommandInTransaction(){

        openConnection();
        action();
        closeConnection();

    }

    private void openConnection() {
        System.out.println("Connect to database");
    }

    public abstract void action(); // implemented by subclasses

    private void closeConnection() {
        System.out.println("Closing the connection");
    }
}