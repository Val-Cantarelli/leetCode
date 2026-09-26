package drill;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountDigitsTest {

    private CountDigits countDigits;

    @BeforeEach
    void setUp() {
        countDigits = new CountDigits();
    }

    @Test
    void shouldCountMultipleOccurrences() {
        assertEquals(3, countDigits.countDigit(122333, 3));
    }

    @Test
    void shouldCountSeparatedOccurrences() {
        assertEquals(3, countDigits.countDigit(50505, 5));
    }

    @Test
    void shouldReturnZeroWhenDigitDoesNotExist() {
        assertEquals(0, countDigits.countDigit(1234, 8));
    }

    @Test
    void shouldHandleSingleMatchingDigit() {
        assertEquals(1, countDigits.countDigit(7, 7));
    }

    @Test
    void shouldHandleSingleNonMatchingDigit() {
        assertEquals(0, countDigits.countDigit(7, 3));
    }

    @Test
    void shouldHandleZero() {
        assertEquals(1, countDigits.countDigit(0, 0));
    }
}