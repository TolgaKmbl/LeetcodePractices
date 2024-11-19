package com.tolgakumbul.leetcode.algorithms.easy.question1920;

import org.springframework.stereotype.Component;

/**
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
 *
 * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 * https://leetcode.com/problems/build-array-from-permutation/description/
 */
@Component(value = "Question-1920")
public class BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            ans[i] = nums[nums[i]];
        return ans;
    }

}