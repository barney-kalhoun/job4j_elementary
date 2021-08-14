package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K4Then4() {
        int p = 10;
        double k = 4;
        int expected = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP24K3Then27() {
        int p = 24;
        double k = 3;
        int expected = 27;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}