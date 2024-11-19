package com.tolgakumbul.leetcode.algorithms.test1;

import com.tolgakumbul.leetcode.algorithms.easy.question1.TwoSum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {

    private TwoSum twoSum;

    @Before
    public void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void testTwoSumCase1(){
        int[] result = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(1, result[1]);
    }

    @Test
    public void testTwoSumCase2(){
        int[] result = twoSum.twoSum(new int[]{3,2,3}, 6);
        Assert.assertEquals(0, result[0]);
        Assert.assertEquals(2, result[1]);
    }

}
