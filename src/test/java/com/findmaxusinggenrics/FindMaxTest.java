package com.findmaxusinggenrics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMaxTest {
    FindMax findMax;

    @Before
    public void initData() {
        System.out.println("Maximum number is : ");
        findMax = new FindMax();
    }

    @Test
    public void givenFirstNumberAsLarge_ShouldReturn_FirstNumberAsMax() {
        Integer max = findMax.findMaxValue(200, 25, 105);
        Assert.assertEquals((Integer) 200, max);
    }

    @Test
    public void givenSecondNumberAsMaximum_ShouldReturn_SecondNumberAsMaximum() {
        Integer max = findMax.findMaxValue(20, 400, 104);
        Assert.assertEquals((Integer) 400, max);
    }

    @Test
    public void givenThirdNumberAsMaximum_ShouldReturnThirdNumberAsMaximum() {
        Integer max = findMax.findMaxValue(10,20,90);
        Assert.assertEquals((Integer) 90, max);
    }

    @Test
    public void givenFirstFloatAsMaximum_ShouldReturnFirstFloatAsMaximum() {
        Float max1 = findMax.findMaxValue(20f, 15f, 10f);
        Assert.assertEquals((Float) 20f, max1);
    }

    @Test
    public void givenSecondFloatAsMaximum_ShouldReturnSecondFloatAsMaximum() {
        Float max1 = findMax.findMaxValue(22f, 30f, 10f);
        Assert.assertEquals((Float) 30f, max1);
    }

    @Test
    public void givenThirdFloatAsMaximum_ShouldReturnThirdFloatAsMaximum() {
        Float max1 = findMax.findMaxValue(20f, 30f, 40f);
        Assert.assertEquals((Float) 40f, max1);
    }
}
