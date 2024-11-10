package com.tolgakumbul.leetcode.algorithms.test35;

import com.tolgakumbul.leetcode.algorithms.question35.SearchInsertPosition;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SearchInsertPositionTest {

    private SearchInsertPosition searchInsertPosition;

    @Before
    public void setUp() {
        searchInsertPosition = new SearchInsertPosition();
    }

    @Test
    public void testSearchInsert(){
        Assert.assertEquals(2, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 5));
        Assert.assertEquals(1, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 2));
        Assert.assertEquals(4, searchInsertPosition.searchInsert(new int[]{1,3,5,6}, 7));
    }

}
