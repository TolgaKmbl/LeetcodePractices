package com.tolgakumbul.leetcode.algorithms.medium.question56;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 * Example 2:
 * <p>
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 *
 * <a href="https://leetcode.com/problems/merge-intervals/description/">...</a>
 */
@Component(value = "Question-56")
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> res = new ArrayList<>();
        int[] temp = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= temp[1]) {
                temp[1] = Math.max(temp[1], intervals[i][1]);
            } else {
                res.add(temp);
                temp = intervals[i];
            }
        }
        res.add(temp);

        return res.toArray(new int[res.size()][]);
    }
}
