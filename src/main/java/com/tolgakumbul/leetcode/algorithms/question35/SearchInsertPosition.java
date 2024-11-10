package com.tolgakumbul.leetcode.algorithms.question35;

import org.springframework.stereotype.Component;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 *
 * <a href="https://leetcode.com/problems/search-insert-position/description/">Q35</a>
 */
@Component(value = "Question-35")
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        for (int i =0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }else if (nums[i] < target){
               continue;
            }
            return i;
        }
        return nums.length;
    }

}
