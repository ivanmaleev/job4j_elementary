package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int result = 0;
        for (int i = 0; i < hours.length; i++) {
            int k = 1;
            if (i == 5 || i == 6) {
                k = 2;
            }
            if (hours[i] > 9) {
                result += k * (8 * 10 + (hours[i] - 8) * 15);
            } else {
                result += k * (hours[i] * 10);
            }

        }
        return result;
    }
}
