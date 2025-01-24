package com.tolgakumbul.leetcode.algorithms.medium.question22;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * Example 2:
 * <p>
 * Input: n = 1
 * Output: ["()"]
 *
 * <a href="https://leetcode.com/problems/generate-parentheses/description/">...</a>
 */
@Component(value = "Question-22")
public class GenerateParentheses {

    /**
     * 								   	(0, 0, '')
     * 								 	    |
     * 									(1, 0, '(')
     * 								   /           \
     * 							(2, 0, '((')      (1, 1, '()')
     * 							   /                 \
     * 						(2, 1, '(()')           (2, 1, '()(')
     * 						   /                       \
     * 					(2, 2, '(())')                (2, 2, '()()')
     * 						      |	                             |
     * 					res.append('(())')             res.append('()()')
     *
     */

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        recurse(res, 0, 0, "", n);
        return res;
    }

    public void recurse(List<String> res, int left, int right, String s, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }

        if (left < n) {
            recurse(res, left + 1, right, s + "(", n);
        }

        if (right < left) {
            recurse(res, left, right + 1, s + ")", n);
        }
    }

}
