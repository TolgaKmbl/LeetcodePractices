package com.tolgakumbul.leetcode.algorithms.test66;

import com.tolgakumbul.leetcode.algorithms.question66.PlusOne;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlusOneTest {

    private PlusOne plusOne;

    @Before
    public void setUp() {
        plusOne = new PlusOne();
    }

    @Test
    public void testPlusOne(){
        Assert.assertArrayEquals(new int[]{1,2,4}, plusOne.plusOne(new int[]{1, 2, 3}));
        Assert.assertArrayEquals(new int[]{4,3,2,2}, plusOne.plusOne(new int[]{4,3,2,1}));
        Assert.assertArrayEquals(new int[]{1,0}, plusOne.plusOne(new int[]{9}));
        Assert.assertArrayEquals(new int[]{6,7,9,0}, plusOne.plusOne(new int[]{6,7,8,9}));
        Assert.assertArrayEquals(new int[]{1,0,0,0,0}, plusOne.plusOne(new int[]{9,9,9,9}));
    }

}
