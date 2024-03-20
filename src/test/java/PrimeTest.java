

import static org.junit.Assert.*;

import org.example.Prime;
import org.junit.Test;

public class PrimeTest {

    @Test
    public void isPrime(){
        Prime p = new Prime();
        assertFalse(p.isPrime(10)); // 10 n'est pas un nombre premier
        assertTrue(p.isPrime(13)); // 13 est un nombre premier
        assertFalse(p.isPrime(50)); // 50 n'est pas un nombre premier
        assertTrue(p.isPrime(17)); // 17 est un nombre premier
        assertFalse(p.isPrime(1)); // 1 n'est pas un nombre premier
    }
}
