package com.tolgakumbul.leetcode.algorithms.test28;

import com.tolgakumbul.leetcode.algorithms.question28.FindIndexOfFirstOccurrenceInString;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindIndexOfFirstOccurrenceInStringTest {

    private FindIndexOfFirstOccurrenceInString findIndexOfFirstOccurrenceInString;

    @Before
    public void setUp() {
        findIndexOfFirstOccurrenceInString = new FindIndexOfFirstOccurrenceInString();
    }

    @Test
    public void testRemoveDuplicates(){
        Assert.assertEquals(0, findIndexOfFirstOccurrenceInString.strStr("sadbutsad", "sad"));
        Assert.assertEquals(3, findIndexOfFirstOccurrenceInString.strStr("leetcode", "tco"));
    }

}
