package com.tolgakumbul.leetcode.algorithms.question4;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * <p>
 * The overall run time complexity should be O(log (m+n)).
 * <p>
 * https://leetcode.com/problems/median-of-two-sorted-arrays
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 * <p>
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
@Component(value = "Question-4")
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLen = nums1.length + nums2.length;
        int[] result = new int[totalLen];
        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
        Arrays.sort(result);
        if(totalLen % 2 != 0){
            return result[((totalLen+1)/2) -1];
        }
        return (double) (result[((totalLen + 1) / 2) - 1] + result[((totalLen + 1) / 2)]) /2;
    }

}
