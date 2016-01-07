package com.marcus.hello.utils;

/**
 * @author marcus
 */
public class StringUtils {



    public static boolean isEmpty(CharSequence cs ){

        return cs == null || cs.length() == 0;
    }
}
