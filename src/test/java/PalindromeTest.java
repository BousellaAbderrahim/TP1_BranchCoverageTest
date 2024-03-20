

import org.example.Palindrome;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void isPalindromeTest(){
        Palindrome p = new Palindrome();
        assertTrue(p.isPalindrome("radar"));
        assertFalse(p.isPalindrome("prime"));
    }


}