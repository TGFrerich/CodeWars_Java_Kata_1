package org.example;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Float.isNaN;

public class Kata {

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        return list.stream().filter(val -> !(val instanceof String)).collect(Collectors.toList());

    }
}
