package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when00to20to00then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int z1 = 0;
        int z2 = 0;
        Point point1 = new Point(x1, y1, z1);
        Point point2 = new Point(x2, y2, z2);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to20to33then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int z1 = 3;
        int z2 = 3;
        Point point1 = new Point(x1, y1, z1);
        Point point2 = new Point(x2, y2, z2);
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }


//    @Test
//    public void when00to20then2() {
//        double expected = 2;
//        int x1 = 0;
//        int y1 = 0;
//        int x2 = 2;
//        int y2 = 0;
//        double out = Point.distance(x1, y1, x2, y2);
//        Assert.assertEquals(expected, out, 0.01);
//    }
//
//    @Test
//    public void when00to40then2() {
//        double expected = 4;
//        int x1 = 0;
//        int y1 = 0;
//        int x2 = 4;
//        int y2 = 0;
//        double out = Point.distance(x1, y1, x2, y2);
//        Assert.assertEquals(expected, out, 0.01);
//    }
//
//    @Test
//    public void when12to11then1() {
//        double expected = 1;
//        int x1 = 1;
//        int y1 = 2;
//        int x2 = 1;
//        int y2 = 1;
//        double out = Point.distance(x1, y1, x2, y2);
//        Assert.assertEquals(expected, out, 0.01);
//    }
//
//    @Test
//    public void when53to23then3() {
//        double expected = 3;
//        int x1 = 5;
//        int y1 = 3;
//        int x2 = 2;
//        int y2 = 3;
//        double out = Point.distance(x1, y1, x2, y2);
//        Assert.assertEquals(expected, out, 0.01);
//    }
}