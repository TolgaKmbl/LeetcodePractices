package com.tolgakumbul.leetcode.algorithms.test22;

import com.tolgakumbul.leetcode.algorithms.medium.question22.GenerateParentheses;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class GenerateParenthesesTest {

    private GenerateParentheses generateParentheses;

    @Before
    public void setUp() {
        generateParentheses = new GenerateParentheses();
    }

    @Test
    public void testGenerateParentheses() {
        Assert.assertEquals(List.of("(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()"),
                generateParentheses.generateParenthesis(4));
    }

}
