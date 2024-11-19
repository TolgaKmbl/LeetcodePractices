package com.tolgakumbul.leetcode.algorithms.test4;

import com.tolgakumbul.leetcode.algorithms.hard.question4.MedianOfTwoSortedArrays;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MedianOfTwoSortedArraysTest {

    private MedianOfTwoSortedArrays medianOfTwoSortedArrays;

    @Before
    public void setUp() {
        medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
    }

    @Test
    public void testFindMedianSortedArrays() {
        Assert.assertEquals(2, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0);
        Assert.assertEquals(2.5, medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 0);
    }
}
