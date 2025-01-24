package com.tolgakumbul.leetcode.algorithms.test51;

import com.tolgakumbul.leetcode.algorithms.hard.question51.NQueen;
import org.junit.Before;
import org.junit.Test;

public class NQueenTest {

    private NQueen nQueen;

    @Before
    public void setUp() {
        nQueen = new NQueen(8);
    }

    @Test
    public void testNQueen() {
        System.out.println(nQueen.solve());
    }
}
