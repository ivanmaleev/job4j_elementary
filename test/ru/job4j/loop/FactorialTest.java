package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int res = Factorial.calc(n);
        int expected = 120;
        Assert.assertEquals(expected, res);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int res = Factorial.calc(n);
        int expected = 1;
        Assert.assertEquals(expected, res);
    }
}