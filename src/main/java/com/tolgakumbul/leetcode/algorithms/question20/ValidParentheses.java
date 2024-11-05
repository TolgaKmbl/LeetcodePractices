package com.tolgakumbul.leetcode.algorithms.question20;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 *
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "()[]{}"
 *
 * Output: true
 *
 * Example 3:
 *
 * Input: s = "(]"
 *
 * Output: false
 *
 * Example 4:
 *
 * Input: s = "([])"
 *
 * Output: true
 *
 * <a href="https://leetcode.com/problems/valid-parentheses/description/">Q20</a>
 */
@Component(value = "Question-20")
public class ValidParentheses {

    private Map<Character, Character> charMap;

    public ValidParentheses() {
        this.charMap = new HashMap<>();
        this.charMap.put(')', '(');
        this.charMap.put(']', '[');
        this.charMap.put('}', '{');
    }

    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                charStack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (charStack.isEmpty()) {
                    return false;
                }
                if (charMap.get(ch) == charStack.peek()) {
                    charStack.pop();
                } else {
                    return false;
                }
            }
        }

        return charStack.isEmpty();
    }

}
