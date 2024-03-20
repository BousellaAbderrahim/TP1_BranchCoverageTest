

import org.example.QuadraticEquation;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuadraticEquationTest {

    @Test
    public void solve() {
        QuadraticEquation Q = new QuadraticEquation();
        double[] solution = {1.00000,-1.00000};
        assertArrayEquals(solution,Q.solve(1,0,-1),1e-6);
        double[] solution2 = {-0.3660251,1.366025};
        assertArrayEquals(solution2,Q.solve(-2,2,1),1e-6);
        double[] solution3 = {0};
        assertArrayEquals(solution3,Q.solve(1,0,0),1e-6);
        double[] solution4 = null;
        assertEquals(solution4,Q.solve(100,1,100));
    }
    @Test(expected = ArithmeticException.class)
    public void solveException(){
        QuadraticEquation Q = new QuadraticEquation();
        Q.solve(0,1,1);
    }
}