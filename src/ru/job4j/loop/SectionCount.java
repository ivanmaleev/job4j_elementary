package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int res = 0;
        while (length - section >= 0) {
            length -= section;
            res++;
        }
        return res;
    }
}
