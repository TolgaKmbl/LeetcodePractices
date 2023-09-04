package com.tolgakumbul.leetcode.test11;

import com.tolgakumbul.leetcode.question11.ContainerWithMostWater;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContainerWithMostWaterTest {

    private ContainerWithMostWater containerWithMostWater;

    @Before
    public void setUp() {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @Test
    public void testMaxArea() {
        Assert.assertEquals(49, containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        Assert.assertEquals(17, containerWithMostWater.maxArea(new int[]{2,3,4,5,18,17,6}));
        Assert.assertEquals(1, containerWithMostWater.maxArea(new int[]{1,1}));
    }

}
