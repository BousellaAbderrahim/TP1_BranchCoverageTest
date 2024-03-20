

import org.example.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15)); // divisible par 3 et 5
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9)); // divisible par 3
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10)); // divisible par 5
        assertEquals("1", FizzBuzz.fizzBuzz(1)); // non divisible par 3 ou 5
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFizzBuzzNegative() {
        FizzBuzz.fizzBuzz(-1); // Valeur négative
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFizzBuzzZero() {
        FizzBuzz.fizzBuzz(0); // Valeur nulle
    }

    @Test
    public void testFizzBuzzNonDivisible() {
        assertEquals("7", FizzBuzz.fizzBuzz(7)); // Non divisible par 3 ou 5
        assertEquals("11", FizzBuzz.fizzBuzz(11)); // Non divisible par 3 ou 5
    }
}
