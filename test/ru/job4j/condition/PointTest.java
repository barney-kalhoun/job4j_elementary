package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21To53Then3() {
        int x1 = 2;
        int y1 = 1;
        int x2 = 5;
        int y2 = 3;
        double expected = 3.60;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when29To38Then1() {
        int x1 = 2;
        int y1 = 9;
        int x2 = 3;
        int y2 = 8;
        double expected = 1.41;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when77To80Then7() {
        int x1 = 7;
        int y1 = 7;
        int x2 = 8;
        int y2 = 0;
        double expected = 7.07;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}