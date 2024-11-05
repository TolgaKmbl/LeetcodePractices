package com.tolgakumbul.leetcode.algorithms.test13;

import com.tolgakumbul.leetcode.algorithms.question13.RomanToInteger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanToIntegerTest {

    private RomanToInteger romanToInteger;

    @Before
    public void setUp() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    public void testRomanToInteger(){
        Assert.assertEquals(27, romanToInteger.romanToInt("XXVII"));
        Assert.assertEquals(2, romanToInteger.romanToInt("II"));
        Assert.assertEquals(12, romanToInteger.romanToInt("XII"));
        Assert.assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}
