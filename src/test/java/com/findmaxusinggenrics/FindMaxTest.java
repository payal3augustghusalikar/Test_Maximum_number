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
        Integer max = findMax.findMaxValue(20, 400, 105);
        Assert.assertEquals((Integer) 400, max);
    }

    @Test
    public void givenThirdNumberAsMaximum_ShouldReturnThirdNumberAsMaximum() {
        Integer max = findMax.findMaxValue(10,20,60);
        Assert.assertEquals((Integer) 60,max);
    }
}
