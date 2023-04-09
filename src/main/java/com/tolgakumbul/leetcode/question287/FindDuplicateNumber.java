package com.tolgakumbul.leetcode.question287;

/**
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * <p>
 * There is only one repeated number in nums, return this repeated number.
 * <p>
 * You must solve the problem without modifying the array nums and uses only constant extra space.
 * https://leetcode.com/problems/find-the-duplicate-number/
 */
public class FindDuplicateNumber {

    /* Floyd's cycle detection algorithm (Tortoise and Hare) */
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Find the intersection point of the two pointers
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Find the entry point of the cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        // Return the repeated number
        return slow;
    }

}
