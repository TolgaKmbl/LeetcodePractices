package com.tolgakumbul.leetcode.algorithms.test7;

import com.tolgakumbul.leetcode.algorithms.question7.ReverseInteger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseIntegerTest {

    private ReverseInteger reverseInteger;

    @Before
    public void setUp() {
        reverseInteger = new ReverseInteger();
    }

    @Test
    public void testReverse(){
        Assert.assertEquals(321, reverseInteger.reverse(123));
        Assert.assertEquals(-32178, reverseInteger.reverse(-87123));
        Assert.assertEquals(1901, reverseInteger.reverse(10910));
        Assert.assertEquals(-1901, reverseInteger.reverse(-10910));
        Assert.assertEquals(0, reverseInteger.reverse(1534236469));
    }

}
