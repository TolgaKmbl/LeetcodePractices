package com.tolgakumbul.leetcode.algorithms.test14;

import com.tolgakumbul.leetcode.algorithms.question14.LongestCommonPrefix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix;

    @Before
    public void setUp() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    public void testLongestCommonPrefix(){
        Assert.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        Assert.assertEquals("a", longestCommonPrefix.longestCommonPrefix(new String[]{"ab", "a"}));
    }

}
