package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {

        boolean result = true;
        boolean element = data[0];

        for (boolean dataElement : data) {
            if (dataElement != element) {
                result = false;
                break;
            }
        }
        return result;
    }
}
