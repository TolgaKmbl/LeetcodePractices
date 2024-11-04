package com.tolgakumbul.leetcode.algorithms.test394;

import com.tolgakumbul.leetcode.algorithms.question394.DecodeString;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DecodeStringTest {

    private DecodeString decodeString;

    @Before
    public void setUp() {
        decodeString = new DecodeString();
    }

    @After
    public void afterEach() {
        decodeString.resetGeneralCounter();
    }

    @Test
    public void testDecodeString1() {
        Assert.assertEquals("aaabcbc", decodeString.decodeString("3[a]2[bc]"));

    }

    @Test
    public void testDecodeString2() {
        Assert.assertEquals("accaccacc", decodeString.decodeString("3[a2[c]]"));

    }

    @Test
    public void testDecodeString3() {
        Assert.assertEquals("abcabccdcdcdef", decodeString.decodeString("2[abc]3[cd]ef"));

    }

}
