package com.tolgakumbul.leetcode.algorithms.test56;

import com.tolgakumbul.leetcode.algorithms.medium.question56.MergeIntervals;
import org.junit.Before;
import org.junit.Test;

public class MergeIntervalsTest {

    private MergeIntervals mergeIntervals;

    @Before
    public void setUp() {
        mergeIntervals = new MergeIntervals();
    }

    @Test
    public void testMerge() {
        mergeIntervals.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        mergeIntervals.merge(new int[][]{{1,4},{4,5}});
    }
}
