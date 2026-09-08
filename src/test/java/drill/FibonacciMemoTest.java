package drill;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciMemoTest {

    @Test
    void returnsZeroForBaseCaseZero() {
        FibonacciMemo solution = new FibonacciMemo();
        assertEquals(0, solution.fibonacciMemo(0));
    }

    @Test
    void returnsOneForBaseCaseOne() {
        FibonacciMemo solution = new FibonacciMemo();
        assertEquals(1, solution.fibonacciMemo(1));
    }

    @Test
    void returnsFiveForPositionFive() {
        FibonacciMemo solution = new FibonacciMemo();
        assertEquals(5, solution.fibonacciMemo(5));
    }

    @Test
    void returnsCorrectValueForLargerInput() {
        FibonacciMemo solution = new FibonacciMemo();
        assertEquals(55, solution.fibonacciMemo(10));
    }

    @Test
    void handlesLargeInputEfficiently() {
        FibonacciMemo solution = new FibonacciMemo();
        assertEquals(9227465, solution.fibonacciMemo(35));
    }
}