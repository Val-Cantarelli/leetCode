package drill;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountZerosTest {

    private CountZeros countZeros;

    @BeforeEach
    void setUp() {
        countZeros = new CountZeros();
    }

    @Test
    void shouldCountMultipleZeros() {
        assertEquals(3, countZeros.countZeros(new int[]{1, 0, 3, 0, 0}));
    }

    @Test
    void shouldReturnZeroWhenThereAreNoZeros() {
        assertEquals(0, countZeros.countZeros(new int[]{1, 2, 3}));
    }

    @Test
    void shouldCountSingleZero() {
        assertEquals(1, countZeros.countZeros(new int[]{0}));
    }

    @Test
    void shouldHandleEmptyArray() {
        assertEquals(0, countZeros.countZeros(new int[]{}));
    }

    @Test
    void shouldCountArrayContainingOnlyZeros() {
        assertEquals(4, countZeros.countZeros(new int[]{0, 0, 0, 0}));
    }
}