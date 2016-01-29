package com.marcus.hello.exceptions;

/**
 * @author marcus
 *         shows the error stack - error propagated from stack.
 */
public class ExamineExceptions {


    public ExamineExceptions() {

    }

    public static void main(String[] args) {
        new ExamineExceptions().method1();

    }

    public void method1() {
        method2();
    }

    public void method2() {
        method3();
    }


    public void method3() {


        int x = 10 / 0; // throws Arithmetic exception


    }


}
