package drill;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Test
    void returnsZeroForBaseCaseZero() {
        Fibonacci solution = new Fibonacci();
        assertEquals(0, solution.fibonacci(0));
    }

    @Test
    void returnsOneForBaseCaseOne() {
        Fibonacci solution = new Fibonacci();
        assertEquals(1, solution.fibonacci(1));
    }

    @Test
    void returnsFiveForPositionFive() {
        Fibonacci solution = new Fibonacci();
        assertEquals(5, solution.fibonacci(5));
    }

    @Test
    void returnsCorrectValueForLargerInput() {
        Fibonacci solution = new Fibonacci();
        assertEquals(55, solution.fibonacci(10));
    }
}