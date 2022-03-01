package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when05to70then8dot6023() {
        double expected = 8.6023;
        int x1 = 0;
        int y1 = 5;
        int x2 = 7;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when65to73then2dot2360() {
        double expected = 2.2360;
        int x1 = 6;
        int y1 = 5;
        int x2 = 7;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when18to35then3dot6055() {
        double expected = 3.6055;
        int x1 = 1;
        int y1 = 8;
        int x2 = 3;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}