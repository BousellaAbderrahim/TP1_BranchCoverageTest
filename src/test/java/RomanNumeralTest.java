

import org.example.RomanNumeral;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralTest {

    @Test
    public void testToRoman() {
        // Test with various input values

        assertEquals("IX", RomanNumeral.toRoman(9));  // 9 should be converted to "IX"
        assertEquals("X", RomanNumeral.toRoman(10));  // 10 should be converted to "X"
        assertEquals("XL", RomanNumeral.toRoman(40));  // 40 should be converted to "XL"
        assertEquals("C", RomanNumeral.toRoman(100));  // 100 should be converted to "C"
        assertEquals("CD", RomanNumeral.toRoman(400));  // 400 should be converted to "CD"
        assertEquals("D", RomanNumeral.toRoman(500));  // 500 should be converted to "D"
        assertEquals("CM", RomanNumeral.toRoman(900));  // 900 should be converted to "CM"
        assertEquals("M", RomanNumeral.toRoman(1000));  // 1000 should be converted to "M"

        // Test with maximum input value
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999));  // 3999 should be converted to "MMMCMXCIX"
        assertEquals("M", RomanNumeral.toRoman(4000));  // 1000 should be converted to "M"

    }
}
