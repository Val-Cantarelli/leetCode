package drill;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SumArrTest {

    private final SumArr solution = new SumArr();

    @Test
    void testPositiveNumbers() {
        assertEquals(20, solution.sumArr(new int[]{2, 4, 6, 8}));
    }

    @Test
    void testMixedNumbers() {
        assertEquals(0, solution.sumArr(new int[]{-3, 5, -2}));
    }

    @Test
    void testEmptyArray() {
        assertEquals(0, solution.sumArr(new int[]{}));
    }

    @Test
    void testSingleElement() {
        assertEquals(7, solution.sumArr(new int[]{7}));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-10, solution.sumArr(new int[]{-2, -3, -5}));
    }

    @Test
    void testAllZeros() {
        assertEquals(0, solution.sumArr(new int[]{0, 0, 0}));
    }
}