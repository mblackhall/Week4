package com.marcus.hello.exceptions.types;

/**
 * @author marcus
 * This is a check exception
 */
public class PostCodeInvalidException extends Exception {

    public PostCodeInvalidException(String message) {
        super(message);
    }
}
