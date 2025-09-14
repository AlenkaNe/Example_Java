package org.example;

public class StringJoiner {

    public static String arrayToString(String[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Передан объект null");
        }
        if (array.length == 0) {
            return "";
        }
        return String.join(", ", array);
    }
}





