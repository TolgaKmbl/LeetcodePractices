package com.tolgakumbul.leetcode.algorithms.test9;

import com.tolgakumbul.leetcode.algorithms.easy.question9.PalindromeNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;

    @Before
    public void setUp() {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    public void testIsPalindrome(){
        Assert.assertFalse(palindromeNumber.isPalindrome(-121));
        Assert.assertFalse(palindromeNumber.isPalindrome(10));
        Assert.assertTrue(palindromeNumber.isPalindrome(121));
    }

}
