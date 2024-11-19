package com.tolgakumbul.leetcode.algorithms.easy.question14;

import org.springframework.stereotype.Component;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * <a href="https://leetcode.com/problems/longest-common-prefix/description/">Q14</a>
 */
@Component(value = "Question-14")
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        String anchorStr = strs[0];
        for (int i=0; i<anchorStr.length(); i++) {
            char currentChar = anchorStr.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if(i >= strs[j].length() || currentChar != strs[j].charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(currentChar);
        }
        return sb.toString();
    }

}
