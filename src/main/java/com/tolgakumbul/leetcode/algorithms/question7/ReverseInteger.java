package com.tolgakumbul.leetcode.algorithms.question7;


import org.springframework.stereotype.Component;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 *
 * If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * https://leetcode.com/problems/reverse-integer/
 */
@Component(value = "Question-7")
public class ReverseInteger {

    public int reverse(int x) {
        try{
            int reverse = 0;
            while(x != 0) {
                reverse = Math.multiplyExact(reverse, 10);
                reverse = Math.addExact(reverse, x % 10);
                x /= 10;
            }
            return reverse;
        }catch(Exception e){
            return 0;
        }
    }

}
