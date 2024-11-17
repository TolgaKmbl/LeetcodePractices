package com.tolgakumbul.leetcode.algorithms.test12;

import com.tolgakumbul.leetcode.algorithms.question12.IntegerToRoman;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntegerToRomanTest {

    private IntegerToRoman integerToRoman;

    @Before
    public void setUp() {
        integerToRoman = new IntegerToRoman();
    }

    @Test
    public void testIntToRoman(){
        Assert.assertEquals("MMMDCCXLIX", integerToRoman.intToRoman(3749));
        Assert.assertEquals("LVIII", integerToRoman.intToRoman(58));
        Assert.assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));
    }

}
