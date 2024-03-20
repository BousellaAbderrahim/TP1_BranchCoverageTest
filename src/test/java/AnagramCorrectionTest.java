

import org.example.AnagramCorrection;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramCorrectionTest {
    AnagramCorrection anagramCorrection = new AnagramCorrection();

    @Test
    public void isAnagram(){

        assertTrue(anagramCorrection.isAnagram("listen","silent"));
        assertFalse(anagramCorrection.isAnagram("listen","rahime"));
        assertTrue(anagramCorrection.isAnagram("rahime","y"));

    }

    @Test(expected = ArithmeticException.class)
    public void testIsAnagramExction() {
        anagramCorrection.isAnagram("rahime",null) ;

    }

    @Test(expected = ArithmeticException.class)
    public void testIsAnagramExction2() {
        anagramCorrection.isAnagram(null,"rahime") ;

    }



}