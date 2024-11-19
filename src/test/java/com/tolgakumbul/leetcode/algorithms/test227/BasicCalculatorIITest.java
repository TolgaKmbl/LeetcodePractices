package com.tolgakumbul.leetcode.algorithms.test227;

import com.tolgakumbul.leetcode.algorithms.medium.question227.BasicCalculatorII;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BasicCalculatorIITest {

    private BasicCalculatorII basicCalculatorII;

    @Before
    public void setUp() {
        basicCalculatorII = new BasicCalculatorII();
    }

    @Test
    public void testCalculate(){
        Assert.assertEquals(7, basicCalculatorII.calculate("3+2*2"));
        Assert.assertEquals(1, basicCalculatorII.calculate(" 3/2 "));
        Assert.assertEquals(5, basicCalculatorII.calculate(" 3+5 / 2 "));
    }
}
