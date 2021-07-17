package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String s = Integer.toString(i);
        for (int ind = 0; ind < s.length() / 2; ind++) {
            if (s.charAt(ind) != s.charAt(s.length() - ind - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check(1112111));
        System.out.println(check(123456321));
    }
}
