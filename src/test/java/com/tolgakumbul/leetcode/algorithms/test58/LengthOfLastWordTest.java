package com.tolgakumbul.leetcode.algorithms.test58;

import com.tolgakumbul.leetcode.algorithms.easy.question58.LengthOfLastWord;
import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordTest {

    @Test
    public void testLengthOfLastWord(){
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        Assert.assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
    }
}
