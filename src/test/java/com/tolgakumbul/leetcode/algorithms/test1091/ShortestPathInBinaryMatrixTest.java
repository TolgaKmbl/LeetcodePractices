package com.tolgakumbul.leetcode.algorithms.test1091;

import com.tolgakumbul.leetcode.algorithms.medium.question1091.ShortestPathInBinaryMatrix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShortestPathInBinaryMatrixTest {

    private ShortestPathInBinaryMatrix shortestPathInBinaryMatrix;

    @Before
    public void setUp() {
        shortestPathInBinaryMatrix = new ShortestPathInBinaryMatrix();
    }

    @Test
    public void testShortestPathBinaryMatrix() {
        Assert.assertEquals(4, shortestPathInBinaryMatrix.shortestPathBinaryMatrix(new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}}));
        Assert.assertEquals(-1, shortestPathInBinaryMatrix.shortestPathBinaryMatrix(new int[][]{{1, 0, 0}, {1, 1, 0}, {1, 1, 0}}));
        Assert.assertEquals(2, shortestPathInBinaryMatrix.shortestPathBinaryMatrix(new int[][]{{0, 1}, {1, 0}}));
        Assert.assertEquals(14, shortestPathInBinaryMatrix.shortestPathBinaryMatrix(new int[][]{{0, 1, 1, 0, 0, 0}, {0, 1, 0, 1, 1, 0}, {0, 1, 1, 0, 1, 0}, {0, 0, 0, 1, 1, 0}, {1, 1, 1, 1, 1, 0}, {1, 1, 1, 1, 1, 0}}));

    }

}
