package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if ("".equals(s)) {
            return "empty";
        } else if (s.length() <= 4) {
            return s;
        } else {
            StringBuilder stringBuilder = new StringBuilder(s);
            for (int i = 0; i < s.length() - 4; i++) {
                stringBuilder.setCharAt(i, '#');
            }
            s = stringBuilder.toString();
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(code("4556364607935616"));
        System.out.println(code("123"));
        System.out.println(code(""));
    }
}
