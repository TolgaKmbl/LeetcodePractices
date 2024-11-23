package com.tolgakumbul.leetcode.algorithms.test15;

import com.tolgakumbul.leetcode.algorithms.medium.question15.ThreeSum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ThreeSumTest {

    private ThreeSum threeSum;

    @Before
    public void setUp() {
        threeSum = new ThreeSum();
    }

    @Test
    public void testThreeSum(){
        Assert.assertEquals(List.of(List.of(-1,-1,2), List.of(-1,0,1)), threeSum.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
