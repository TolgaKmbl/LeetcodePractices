package com.tolgakumbul.leetcode.algorithms.question5;

import org.springframework.stereotype.Component;

/**
 * Given a string s, return the longest
 * palindromic
 *
 * substring
 *  in s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 *
 * <a href="https://leetcode.com/problems/longest-palindromic-substring/description/">Q5</a>
 */
@Component(value = "Question-5")
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            // Tek merkezli genişleme
            String oddPalindrome = expandAroundCenter(s, i, i);
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }

            // Çift merkezli genişleme
            if (i + 1 < s.length()) {
                String evenPalindrome = expandAroundCenter(s, i, i + 1);
                if (evenPalindrome.length() > longest.length()) {
                    longest = evenPalindrome;
                }
            }
        }

        return longest;
    }

    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

}
