import org.example.RomanNumeralCorrection;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumeralCorrectionTest {

    @Test
    public void testToRoman() {
        // Test de valeurs valides
        assertEquals("I", RomanNumeralCorrection.toRoman(1));
        assertEquals("III", RomanNumeralCorrection.toRoman(3));
        assertEquals("IV", RomanNumeralCorrection.toRoman(4));
        assertEquals("IX", RomanNumeralCorrection.toRoman(9));
        assertEquals("X", RomanNumeralCorrection.toRoman(10));
        assertEquals("XIII", RomanNumeralCorrection.toRoman(13));
        assertEquals("XL", RomanNumeralCorrection.toRoman(40));
        assertEquals("L", RomanNumeralCorrection.toRoman(50));
        assertEquals("XC", RomanNumeralCorrection.toRoman(90));
        assertEquals("C", RomanNumeralCorrection.toRoman(100));
        assertEquals("CD", RomanNumeralCorrection.toRoman(400));
        assertEquals("D", RomanNumeralCorrection.toRoman(500));
        assertEquals("CM", RomanNumeralCorrection.toRoman(900));
        assertEquals("M", RomanNumeralCorrection.toRoman(1000));
        assertEquals("MMMCMXCIX", RomanNumeralCorrection.toRoman(3999));

        // Test de valeurs invalides (doit lever une exception)
        try {
            RomanNumeralCorrection.toRoman(0);
        } catch (IllegalArgumentException e) {
            assertEquals("n must be between 1 and 3999", e.getMessage());
        }

        try {
            RomanNumeralCorrection.toRoman(4000);
        } catch (IllegalArgumentException e) {
            assertEquals("n must be between 1 and 3999", e.getMessage());
        }
    }
}
