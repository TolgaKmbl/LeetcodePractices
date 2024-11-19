package com.tolgakumbul.leetcode.algorithms.medium.question227;

import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * Given a string s which represents an expression, evaluate this expression and return its value.
 *
 * The integer division should truncate toward zero.
 *
 * You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].
 *
 * Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
 *
 *
 *
 * Example 1:
 *
 * Input: s = "3+2*2"
 * Output: 7
 * Example 2:
 *
 * Input: s = " 3/2 "
 * Output: 1
 * Example 3:
 *
 * Input: s = " 3+5 / 2 "
 * Output: 5
 *
 * <a href="https://leetcode.com/problems/basic-calculator-ii/description/">...</a>
 */
@Component(value = "Question-227")
public class BasicCalculatorII {

    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();

        int num = 0;
        char operator = '+';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                //Convert char to number, if preceded by a number add it as a digit
                num = num * 10 + (c - '0');
            }

            if (!Character.isDigit(c) && c != ' ' || i == s.length() -1 ) {
                /**
                 * Push numbers up front, modify the last number if the operator is * or /
                 * For example; '3+2*2'
                 * Stack is -> [3, 2] then [3, (2*2)]
                 * The answer is 7
                 */
                if (operator == '+') st.push(num);
                else if (operator == '-') st.push(-num);
                else if (operator == '*') st.push(st.pop() * num);
                else if (operator == '/') st.push(st.pop() / num);

                num = 0;
                operator = c;
            }
        }

        int ans = 0;

        while (!st.isEmpty()) {
            ans += st.pop();
        }

        return ans;
    }
}
