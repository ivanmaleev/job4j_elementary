package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        int maxFirstSecond = max(first, second);
        int maxThirdFourth = max(third, fourth);
        return max(first, second, max(third, fourth));
    }

    public static void main(String[] args) {
        System.out.println(max(1, 4));
        System.out.println(max(6, 6));
        System.out.println(max(7, 2));
    }
}
