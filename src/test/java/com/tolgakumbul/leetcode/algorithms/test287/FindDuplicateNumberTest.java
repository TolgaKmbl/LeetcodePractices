package com.tolgakumbul.leetcode.algorithms.test287;

import com.tolgakumbul.leetcode.algorithms.question287.FindDuplicateNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindDuplicateNumberTest {

    private FindDuplicateNumber findDuplicateNumber;

    @Before
    public void setUp() {
        findDuplicateNumber = new FindDuplicateNumber();
    }

    @Test
    public void testFindDuplicate() {
        int duplicate = findDuplicateNumber.findDuplicate(new int[]{1, 3, 4, 2, 2});
        Assert.assertEquals(2, duplicate);
    }

    @Test
    public void testFindDuplicateCase2() {
        int duplicate = findDuplicateNumber.findDuplicate(new int[]{3, 1, 3, 4, 2});
        Assert.assertEquals(3, duplicate);
    }

}
