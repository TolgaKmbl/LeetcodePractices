package com.tolgakumbul.leetcode.algorithms.medium.question15;

import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that
 * i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 * Example 2:
 *
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * Example 3:
 *
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 *
 * <a href="https://leetcode.com/problems/3sum/description/">Q15</a>
 */
@Component(value = "Question-15")
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            /**
             * Two Sum Algorithm
             */
            Map<Integer, Boolean> map = new HashMap<>();
            int target = -nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[j]; // nums[j] + nums[k] = -nums[i]
                if (map.getOrDefault(complement, false)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(triplet);
                    result.add(triplet);
                }
                map.put(nums[j], true);
            }
        }
        return new ArrayList<>(result);
    }

}
