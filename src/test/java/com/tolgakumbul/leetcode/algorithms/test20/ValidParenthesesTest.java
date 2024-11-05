package com.tolgakumbul.leetcode.algorithms.test20;

import com.tolgakumbul.leetcode.algorithms.question14.LongestCommonPrefix;
import com.tolgakumbul.leetcode.algorithms.question20.ValidParentheses;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidParenthesesTest {

    private ValidParentheses validParentheses;

    @Before
    public void setUp() {
        validParentheses = new ValidParentheses();
    }

    @Test
    public void testIsValid(){
        Assert.assertTrue(validParentheses.isValid("()"));
        Assert.assertTrue(validParentheses.isValid("()[]{}"));
        Assert.assertTrue(validParentheses.isValid("([])"));
        Assert.assertFalse(validParentheses.isValid("(]"));
        Assert.assertFalse(validParentheses.isValid("(){}}{"));
    }

}
