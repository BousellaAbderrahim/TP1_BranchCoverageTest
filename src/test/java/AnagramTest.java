

import org.example.Anagram;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void isAnagram() {
        Anagram anagram = new Anagram();
        assertTrue(anagram.isAnagram("listen","silent"));
    }
}
