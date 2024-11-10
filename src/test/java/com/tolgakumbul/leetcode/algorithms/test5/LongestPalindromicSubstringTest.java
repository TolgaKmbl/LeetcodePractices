package com.tolgakumbul.leetcode.algorithms.test5;

import com.tolgakumbul.leetcode.algorithms.question5.LongestPalindromicSubstring;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestPalindromicSubstringTest {

    private LongestPalindromicSubstring longestPalindromicSubstring;

    @Before
    public void setUp() {
        longestPalindromicSubstring = new LongestPalindromicSubstring();
    }

    @Test
    public void testSearchInsert(){
        Assert.assertEquals("bab", longestPalindromicSubstring.longestPalindrome("babad"));
        Assert.assertEquals("bab", longestPalindromicSubstring.longestPalindromeWithDynamicProgramming("babad"));
        Assert.assertEquals("bb", longestPalindromicSubstring.longestPalindrome("cbbd"));
        Assert.assertEquals("bb", longestPalindromicSubstring.longestPalindromeWithDynamicProgramming("cbbd"));
    }

}
