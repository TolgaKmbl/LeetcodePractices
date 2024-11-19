package com.tolgakumbul.leetcode.algorithms.medium.question5;

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

    /**
     *
     * Expand Around Center Solution
     *
     */
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

    /**
     *
     * Dynamic Programming Solution
     *
     */
    public String longestPalindromeWithDynamicProgramming(String s) {
        int n = s.length();
        if (n < 2) return s; // Tek karakterli veya boş string durumunda direkt stringi döndür

        // dp tablosunu oluştur
        boolean[][] dp = new boolean[n][n];
        int start = 0, maxLength = 1;

        // Tek karakterli alt diziler palindromdur
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // İki karakterlik alt dizileri kontrol et
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Üç veya daha fazla karakterli alt dizileri kontrol et
        for (int len = 3; len <= n; len++) { // len, alt dizinin uzunluğunu temsil eder
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1; // Alt dizinin son karakteri

                // s[i] ve s[j] eşitse ve s[i+1:j-1] bir palindrom ise
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]) {
                    dp[i][j] = true;

                    // En uzun palindromu güncelle
                    if (len > maxLength) {
                        start = i;
                        maxLength = len;
                    }
                }
            }
        }

        // En uzun palindromu döndür
        return s.substring(start, start + maxLength);
    }

}
