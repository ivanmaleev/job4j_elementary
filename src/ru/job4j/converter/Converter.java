package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
//        float euro = Converter.rubleToEuro(140);
//        System.out.println("140 rubles are " + euro + " euro.");
//
//        float dollar = Converter.rubleToDollar(360);
//        System.out.println("360 rubles are " + dollar + " dollars.");

        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float inE = 360;
        float expectedE = 6;
        float outE = Converter.rubleToDollar(inE);
        boolean passedE = expectedE == outE;
        System.out.println("360 rubles are 6. Test result : " + passedE);

    }
}
