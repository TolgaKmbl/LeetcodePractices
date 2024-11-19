package com.tolgakumbul.leetcode.algorithms.easy.question67;

import org.springframework.stereotype.Component;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 *
 *
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 * <a href="https://leetcode.com/problems/add-binary/description/">Q67</a>
 */
@Component(value = "Question-67")
public class AddBinary {

    public String addBinary(String a, String b) {
        if(a.length() != b.length()){
            int maxLength = Math.max(a.length(), b.length());
            if(maxLength == a.length()){
                b = padWithZeros(b, a.length());
            } else {
                a = padWithZeros(a, b.length());
            }
        }

        Boolean carry = false;
        StringBuilder sb = new StringBuilder();
        for(int i = a.length()-1; i >= 0; i--) {
            /**
             * 1+1=0 with carry 1
             * 1+0=1 with carry 0
             * 0+1=1 with carry 0
             * 0+0=0 with carry 0
             */
            if(a.charAt(i) == '1' && b.charAt(i) == '1') {
                if(carry){
                    sb.append("1");
                } else {
                    sb.append("0");
                }
                carry = true;
            } else {
                if(a.charAt(i) == '0' && b.charAt(i) == '0'){
                    if(carry){
                        sb.append("1");
                        carry = false;
                    } else {
                        sb.append("0");
                    }
                } else {
                    if(carry){
                        sb.append("0");
                    } else {
                        sb.append("1");
                    }
                }
            }
        }

        if(carry){
            sb.append( "1");
        }

        return sb.reverse().toString();
    }

    private String padWithZeros(String input, int targetLength) {
        StringBuilder padded = new StringBuilder();
        while (padded.length() + input.length() < targetLength) {
            padded.append('0');
        }
        padded.append(input);
        return padded.toString();
    }
}
