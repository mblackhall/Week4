package com.marcus.hello.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marcust
 */
public class ArrayUtil {

    /**
     *
     * @param list
     * @param predicate if true will be returned in list
     * @param <T>
     * @return
     */
    public static <T> List<T> select(List<T> list, Predicate<T> predicate) {

        if (list == null || list.isEmpty()) return list;

        List<T> selectedList = new ArrayList<>();
        for (T item : list) {

            if (predicate.evaluate()) {
                selectedList.add(item);
            }

        }
        return selectedList;

    }


}
