package com.tolgakumbul.leetcode.algorithms.medium.question394;

import org.springframework.stereotype.Component;

/**
 *Given an encoded string, return its decoded string.
 *
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times.
 * Note that k is guaranteed to be a positive integer.
 *
 * You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc.
 * Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k.
 * For example, there will not be input like 3a or 2[4].
 *
 * The test cases are generated so that the length of the output will never exceed 105.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "3[a]2[bc]"
 * Output: "aaabcbc"
 * Example 2:
 *
 * Input: s = "3[a2[c]]"
 * Output: "accaccacc"
 * Example 3:
 *
 * Input: s = "2[abc]3[cd]ef"
 * Output: "abcabccdcdcdef"
 *
 * <a href="https://leetcode.com/problems/decode-string/description/">Q394</a>
 */
@Component(value = "Question-394")
public class DecodeString {

    private int generalCounter = 0;

    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        String tmp_string = "";

        while (generalCounter < s.length()) {
            char c = s.charAt(generalCounter);
            generalCounter++;

            if (c == '[') {
                tmp_string = decodeString(s);
                for (int j = 0; j < count; j++) {
                    sb.append(tmp_string);
                }
                count = 0;
            } else if (c == ']') {
                break;
            } else if (Character.isDigit(c)) {
                count = count * 10 + c - '0';
            } else {
                sb.append(c);
            }
        }


        return sb.toString();
    }

    public void resetGeneralCounter(){
        this.generalCounter = 0;
    }
}