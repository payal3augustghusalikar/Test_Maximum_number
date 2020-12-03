package com.findmaxusinggenrics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMaxTest {
    FindMax findMax;


    @Test
    public void givenFirstNumberAsLarge_ShouldReturn_FirstNumberAsMax() {
        Assert.assertSame( 200, findMax.findMaxValue(200, 25, 105));
    }

    @Test
    public void givenSecondNumberAsMaximum_ShouldReturn_SecondNumberAsMaximum() {
        Assert.assertEquals(400, findMax.findMaxValue(20, 400, 104));
    }

    @Test
    public void givenThirdNumberAsMaximum_ShouldReturnThirdNumberAsMaximum() {
        Assert.assertEquals( 90, findMax.findMaxValue(10, 20, 90));
    }

    @Test
    public void givenFirstFloatAsMaximum_ShouldReturnFirstFloatAsMaximum() {
        Assert.assertEquals(20f, findMax.findMaxValue(20f, 15f, 10f));
    }

    @Test
    public void givenSecondFloatAsMaximum_ShouldReturnSecondFloatAsMaximum() {
        Assert.assertEquals((Float) 30f,findMax.findMaxValue(22f, 30f, 10f));
    }

    @Test
    public void givenThirdFloatAsMaximum_ShouldReturnThirdFloatAsMaximum() {
        Assert.assertEquals((Float) 40f, findMax.findMaxValue(20f, 30f, 40f));
    }

    @Test
    public void givenFirstLetterAsMaximum_ShouldReturnFirstLetterAsMaximum() {
        Assert.assertEquals((String) "tendulkar", findMax.findMaxValue("tendulkar", "virat", "dhonii"));
    }
    @Test
    public void givenSecondLetterAsMaximum_ShouldReturnSecondLetterAsMaximum() {
        Assert.assertEquals((String) "salmankhan", findMax.findMaxValue("ponting", "salmankhan", "virat"));
    }
    @Test
    public void givenThirdLetterAsMaximum_ShouldReturnThirdLetterAsMaximum() {
        Assert.assertEquals((String) "kedarnath", findMax.findMaxValue("rahul", "sachin", "kedarnath"));
    }
}