package com.tolgakumbul.leetcode.algorithms.easy.question28;

import org.springframework.stereotype.Component;

/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 *
 *
 * Example 1:
 *
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * Example 2:
 *
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 *
 *
 * <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/">Q28</a>
 */
@Component(value = "Question-26")
public class FindIndexOfFirstOccurrenceInString {

    public int strStr(String haystack, String needle) {
        /**
         * return haystack.indexOf(needle);
         */
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }

}
