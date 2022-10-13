package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP32K2Square40Dot96() {
        double expected = 40.96;
        int p = 32;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K2Square8() {
        double expected = 8;
        int p = 12;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenEquals() {
        int result = 1;
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}