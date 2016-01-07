package com.marcus.hello.utils;

/**
 * @author marcus
 */
public class StringUtils {

    private StringUtils(){};

    public static boolean isEmpty(String string ){

        return string == null || string.isEmpty();
    }
}
