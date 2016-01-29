package com.marcus.hello.exceptions;

import com.marcus.hello.exceptions.types.MyRuntimeException;
import com.marcus.hello.exceptions.types.PostCodeInvalidException;

/**
 * @author marcus
 */
public class ExampleCatching {

    // method does not need to have MyRuntimeException in throws clause
    void method1() {

        throw new MyRuntimeException();

    }


    void method2(String postCode) {

        if (postCode == null || !postCode.equals("2222XX")) {
            try {
                throw new PostCodeInvalidException("Only 2222XX is allowed");
            } catch (PostCodeInvalidException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    // .. or you can not catch it but throw and declare in method clause
    void method3(String postCode) throws PostCodeInvalidException {

        if (postCode == null || !postCode.equals("2222XX")) {

            throw new PostCodeInvalidException("Only 2222XX is allowed");

        }

    }

    public static void main(String[] args) {

        ExampleCatching ec = new ExampleCatching();
        try {
            ec.method1();
        } catch (MyRuntimeException e){
            System.out.println("caught runtime exception");

        }

        ec.method2("2222XX");

        try {
            ec.method3("1222XX");
        } catch (PostCodeInvalidException e) {
            e.printStackTrace();
        }


    }
}
