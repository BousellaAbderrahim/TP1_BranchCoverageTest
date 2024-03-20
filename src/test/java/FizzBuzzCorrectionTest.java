

import org.example.FizzBuzzCorrection;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzCorrectionTest {

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzzCorrection.fizzBuzz(15)); // divisible par 3 et 5
        assertEquals("Fizz", FizzBuzzCorrection.fizzBuzz(9)); // divisible par 3
        assertEquals("Buzz", FizzBuzzCorrection.fizzBuzz(10)); // divisible par 5
        assertEquals("1", FizzBuzzCorrection.fizzBuzz(1)); // non divisible par 3 ou 5
        assertEquals("Fizz", FizzBuzzCorrection.fizzBuzz(99)); // divisible par 3
        assertEquals("Buzz", FizzBuzzCorrection.fizzBuzz(100)); // divisible par 5
        assertEquals("FizzBuzz", FizzBuzzCorrection.fizzBuzz(150)); // divisible par 3 et 5
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFizzBuzzNegative() {
        FizzBuzzCorrection.fizzBuzz(-1); // Valeur négative
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFizzBuzzZero() {
        FizzBuzzCorrection.fizzBuzz(0); // Valeur nulle
    }

    @Test
    public void testFizzBuzzNonDivisible() {
        assertEquals("7", FizzBuzzCorrection.fizzBuzz(7)); // Non divisible par 3 ou 5
        assertEquals("11", FizzBuzzCorrection.fizzBuzz(11)); // Non divisible par 3 ou 5
    }
}
