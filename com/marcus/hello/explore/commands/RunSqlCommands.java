package com.marcus.hello.explore.commands;

/**
 * @author marcus
 */
public class RunSqlCommands {

    public static void main(String[] args) {

      new CreateStudentSql().runCommandInTransaction();

      new ListStudentsSql().runCommandInTransaction();


    }
}
