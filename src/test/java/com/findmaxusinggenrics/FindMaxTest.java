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
}
