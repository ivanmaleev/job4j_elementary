package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumFirst(double first, double second) {
        return dif(first, second) + div(first, second);
    }

    public static double sumSecond(double first, double second) {
        return dif(first, second) + div(first, second) + sum(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        //System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат первого расчета равен: " + sumFirst(10, 20));
        System.out.println("Результат второго расчета равен: " + sumSecond(10, 20));
    }

}