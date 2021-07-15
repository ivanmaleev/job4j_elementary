package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int result = 0;
        int ind = 1;
        for (int i = a; i <= b; i++) {
            if (ind % 2 == 1) {
                result += result;
                ind++;
            }
        }
        return result;
    }


}
