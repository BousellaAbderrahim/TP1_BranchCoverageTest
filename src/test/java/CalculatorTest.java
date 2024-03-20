

import static org.junit.Assert.*;

import org.example.Calculator;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        assertEquals(5 , calculator.add(2,3)); // 2 + 3 = 5
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.subtract(1, 2)); // 1 - 2 = -1
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.multiply(2, 5)); // 2 * 5 = 10
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.divide(9, 3)); // 9 / 3 = 3
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(6, 0); // Tentative de division par zéro
    }
}
