package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int result = 0;
        int ind = 0;
        for (int i = a; i <= b; i++) {
            if (ind % 2 == 0) {
                result += i;
            }
            ind++;
        }
        return result;
    }

    public static void main(String[] args) {
        int sum = sum(0, 5);
        System.out.println(sum);
    }
}
