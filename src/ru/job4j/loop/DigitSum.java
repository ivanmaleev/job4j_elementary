package ru.job4j.loop;

public class DigitSum {
    public static int sum(int num) {
        int sum = (num / 1000);
        num -= sum - sum * 1000;
        sum += (num / 100);
        num -= sum * 100;
        sum += (num / 10);
        num -= (num / 10) * 10;
        sum += num % 10;
        return sum;
    }

    public static void main(String[] args) {
        // res = sum(1);
        //System.out.println(res);
        //res = sum(3);
        //System.out.println(res);
        int res = sum(123);
        System.out.println(res);
    }
}
