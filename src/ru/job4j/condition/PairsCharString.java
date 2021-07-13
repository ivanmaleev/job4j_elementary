package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        if ("".equals(l) && "".equals(r)) {
            return true;
        }
        if (l.charAt(0) == r.charAt(r.length() - 1)
                && r.charAt(0) == l.charAt(l.length() - 1)) {
            return true;
        }
        return false;
    }
}
