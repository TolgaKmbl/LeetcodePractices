package com.tolgakumbul.leetcode.algorithms.question9;

import org.springframework.stereotype.Component;

/**
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 *
 *<a href="https://leetcode.com/problems/palindrome-number/">...</a>
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 *
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.
 *
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.
 */
@Component(value = "Question-9")
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int y = x;
        int z = 0;
        while(y != 0){
            z=z*10+(y%10);
            y=y/10;
        }
        return x == z;
    }
}
