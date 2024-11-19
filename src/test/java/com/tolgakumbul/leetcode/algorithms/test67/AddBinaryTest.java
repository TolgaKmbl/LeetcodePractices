package com.tolgakumbul.leetcode.algorithms.test67;

import com.tolgakumbul.leetcode.algorithms.easy.question67.AddBinary;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddBinaryTest {

    private AddBinary addBinary;

    @Before
    public void setUp() {
        addBinary = new AddBinary();
    }

    @Test
    public void testAddBinary(){
        Assert.assertEquals("10101", addBinary.addBinary("1010", "1011"));
        Assert.assertEquals("100", addBinary.addBinary("1", "11"));
    }
}
