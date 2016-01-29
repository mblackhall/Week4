package com.marcus.hello.exceptions.types;

/**
 * @author marcus
 * This is a CHECKED exception - you have to catch it !
 */
public class PostCodeInvalidException extends Exception {

    public PostCodeInvalidException(String message) {
        super(message);
    }
}
