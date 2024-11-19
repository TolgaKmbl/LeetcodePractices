package com.tolgakumbul.leetcode.algorithms.medium.question12;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 *Seven different symbols represent Roman numerals with the following values:
 *
 * Symbol	Value
 * I	1
 * V	5
 * X	10
 * L	50
 * C	100
 * D	500
 * M	1000
 * Roman numerals are formed by appending the conversions of decimal place values from highest to lowest.
 * Converting a decimal place value into a Roman numeral has the following rules:
 *
 * If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input,
 * append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.
 * If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol,
 * for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX.
 * Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
 * Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10.
 * You cannot append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append a symbol 4 times use the subtractive form.
 * Given an integer, convert it to a Roman numeral.
 *
 *
 *
 * Example 1:
 *
 * Input: num = 3749
 *
 * Output: "MMMDCCXLIX"
 *
 * Explanation:
 *
 * 3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
 *  700 = DCC as 500 (D) + 100 (C) + 100 (C)
 *   40 = XL as 10 (X) less of 50 (L)
 *    9 = IX as 1 (I) less of 10 (X)
 * Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
 * Example 2:
 *
 * Input: num = 58
 *
 * Output: "LVIII"
 *
 * Explanation:
 *
 * 50 = L
 *  8 = VIII
 * Example 3:
 *
 * Input: num = 1994
 *
 * Output: "MCMXCIV"
 *
 * Explanation:
 *
 * 1000 = M
 *  900 = CM
 *   90 = XC
 *    4 = IV
 *
 *
 * <a href="https://leetcode.com/problems/integer-to-roman/description/">Q12</a>
 */
@Component(value = "Question-12")
public class IntegerToRoman {

    private final Map<Integer, Character> romanValueLetters;

    public IntegerToRoman() {
        this.romanValueLetters = new HashMap<>();
        this.romanValueLetters.put(1, 'I');
        this.romanValueLetters.put(5, 'V');
        this.romanValueLetters.put(10, 'X');
        this.romanValueLetters.put(50, 'L');
        this.romanValueLetters.put(100, 'C');
        this.romanValueLetters.put(500, 'D');
        this.romanValueLetters.put(1000, 'M');
    }

    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();

        // Process thousands place
        roman.append(repeat(this.romanValueLetters.get(1000), num / 1000));
        num %= 1000;

        // Process hundreds place
        roman.append(convertPlace(num / 100, 100, 500, 1000));
        num %= 100;

        // Process tens place
        roman.append(convertPlace(num / 10, 10, 50, 100));
        num %= 10;

        // Process units place
        roman.append(convertPlace(num, 1, 5, 10));

        return roman.toString();
    }

    private String convertPlace(int digit, int one, int five, int ten) {
        StringBuilder roman = new StringBuilder();
        if (digit == 9) {
            roman.append(this.romanValueLetters.get(one))
                    .append(this.romanValueLetters.get(ten)); // Subtractive form (e.g., IX, XC, CM)
        } else if (digit >= 5) {
            roman.append(this.romanValueLetters.get(five))
                    .append(repeat(this.romanValueLetters.get(one), digit - 5)); // 5 + additional ones
        } else if (digit == 4) {
            roman.append(this.romanValueLetters.get(one))
                    .append(this.romanValueLetters.get(five)); // Subtractive form (e.g., IV, XL, CD)
        } else {
            roman.append(repeat(this.romanValueLetters.get(one), digit)); // Repeated ones (e.g., III)
        }
        return roman.toString();
    }

    private String repeat(Character ch, int count) {
        return ch == null ? "" : String.valueOf(ch).repeat(Math.max(0, count));
    }

}
