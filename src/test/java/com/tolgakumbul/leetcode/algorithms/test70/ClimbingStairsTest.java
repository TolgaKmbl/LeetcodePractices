package com.tolgakumbul.leetcode.algorithms.test70;

import com.tolgakumbul.leetcode.algorithms.question70.ClimbingStairs;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClimbingStairsTest {

    private ClimbingStairs climbingStairs;

    @Before
    public void setUp() {
        climbingStairs = new ClimbingStairs();
    }

    @Test
    public void testClimbStairs() {
        Assert.assertEquals(2, climbingStairs.climbStairs(2));
        Assert.assertEquals(1, climbingStairs.climbStairs(1));
        Assert.assertEquals(3, climbingStairs.climbStairs(3));
    }

}
