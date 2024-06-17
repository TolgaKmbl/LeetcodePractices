package com.tolgakumbul.leetcode.algorithms.question3;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * <p>
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
@Component(value = "Question-3")
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        if (s.isEmpty() || s.length() == 1) {
            return s.length();
        }

        int maxLen = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(!sb.toString().contains(String.valueOf(s.charAt(i)))){
                sb.append(s.charAt(i));
            } else {
                maxLen = Math.max(maxLen, sb.length());
                sb.delete(0, sb.indexOf(String.valueOf(s.charAt(i)))+1);
                sb.append(s.charAt(i));
            }
        }

        return Math.max(maxLen, sb.length());
    }
}
