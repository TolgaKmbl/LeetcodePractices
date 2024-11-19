package com.tolgakumbul.leetcode.algorithms.test69;

import com.tolgakumbul.leetcode.algorithms.question66.PlusOne;
import com.tolgakumbul.leetcode.algorithms.question69.SquareRootOfX;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareRootOfXTest {

    private SquareRootOfX squareRootOfX;

    @Before
    public void setUp() {
        squareRootOfX = new SquareRootOfX();
    }

    @Test
    public void testMySqrt(){
        Assert.assertEquals(2, squareRootOfX.mySqrt(4));
        Assert.assertEquals(2, squareRootOfX.mySqrt(8));
        Assert.assertEquals(3, squareRootOfX.mySqrt(9));
    }


}
