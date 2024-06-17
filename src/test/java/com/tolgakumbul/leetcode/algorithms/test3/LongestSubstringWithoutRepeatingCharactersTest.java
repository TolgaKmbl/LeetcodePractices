package com.tolgakumbul.leetcode.algorithms.test3;

import com.tolgakumbul.leetcode.algorithms.question3.LongestSubstringWithoutRepeatingCharacters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    private LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

    @Before
    public void setUp() {
        longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    public void testLengthOfLongestSubstring(){
        Assert.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
        Assert.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
        Assert.assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(" "));
        Assert.assertEquals(2, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("au"));
        Assert.assertEquals(2, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("aab"));
        Assert.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("dvdf"));
        Assert.assertEquals(4, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("xxzqi"));
        Assert.assertEquals(2, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("cdd"));
        Assert.assertEquals(5, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("ckilbkd"));
        Assert.assertEquals(6, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbtablud"));
    }

}

