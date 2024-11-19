package com.tolgakumbul.leetcode.algorithms.test1920;

import com.tolgakumbul.leetcode.algorithms.easy.question1920.BuildArrayFromPermutation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuildArrayFromPermutationTest {

    private BuildArrayFromPermutation buildArrayFromPermutation;

    @Before
    public void setUp() {
        buildArrayFromPermutation = new BuildArrayFromPermutation();
    }

    @Test
    public void testBuildArray() {
        Assert.assertArrayEquals(new int[]{0, 1, 2, 4, 5, 3}, buildArrayFromPermutation.buildArray(new int[]{0, 2, 1, 5, 3, 4}));
        Assert.assertArrayEquals(new int[]{4, 5, 0, 1, 2, 3}, buildArrayFromPermutation.buildArray(new int[]{5, 0, 1, 2, 3, 4}));
    }

}
