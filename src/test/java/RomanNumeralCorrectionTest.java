

import org.example.RomanNumeralCorrection;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralCorrectionTest {

    @Test
    public void testToRoman() {
        // Test with various input values

        assertEquals("I", RomanNumeralCorrection.toRoman(1));  // 1 should be converted to "I"
        assertEquals("III", RomanNumeralCorrection.toRoman(3));  // 3 should be converted to "III"
        assertEquals("IV", RomanNumeralCorrection.toRoman(4));  // 4 should be converted to "IV"
        assertEquals("IX", RomanNumeralCorrection.toRoman(9));  // 9 should be converted to "IX"
        assertEquals("X", RomanNumeralCorrection.toRoman(10));  // 10 should be converted to "X"
        assertEquals("XL", RomanNumeralCorrection.toRoman(40));  // 40 should be converted to "XL"
        assertEquals("XC", RomanNumeralCorrection.toRoman(90));  // 90 should be converted to "XC"
        assertEquals("C", RomanNumeralCorrection.toRoman(100));  // 100 should be converted to "C"
        assertEquals("CD", RomanNumeralCorrection.toRoman(400));  // 400 should be converted to "CD"
        assertEquals("D", RomanNumeralCorrection.toRoman(500));  // 500 should be converted to "D"
        assertEquals("CM", RomanNumeralCorrection.toRoman(900));  // 900 should be converted to "CM"
        assertEquals("M", RomanNumeralCorrection.toRoman(1000));  // 1000 should be converted to "M"

        // Test with maximum input value
        assertEquals("MMMCMXCIX", RomanNumeralCorrection.toRoman(3999));  // 3999 should be converted to "MMMCMXCIX"
        assertEquals("M", RomanNumeralCorrection.toRoman(4000));  // 1000 should be converted to "M"

    }
}
