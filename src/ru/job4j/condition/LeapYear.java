package ru.job4j.condition;

public class LeapYear {
    public static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 != 0 && year % 4 == 0) {
            return true;
        }
        return false;
    }
}
