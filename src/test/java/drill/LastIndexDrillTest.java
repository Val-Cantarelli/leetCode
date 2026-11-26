package drill;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastIndexDrillTest {

    private LastIndexDrill lastIndex;

    @BeforeEach
    void setUp() {
        lastIndex = new LastIndexDrill();
    }

    @Test
    void shouldReturnLastOccurrence() {
        assertEquals(3, lastIndex.lastIndexDrill(new int[]{4, 2, 7, 2, 9}, 2));
    }

    @Test
    void shouldReturnLastIndexWhenAllElementsMatch() {
        assertEquals(2,  lastIndex.lastIndexDrill(new int[]{5, 5, 5}, 5));
    }

    @Test
    void shouldReturnZeroWhenTargetIsAtFirstPosition() {
        assertEquals(0,  lastIndex.lastIndexDrill(new int[]{7, 2, 3}, 7));
    }

    @Test
    void shouldReturnMinusOneWhenTargetDoesNotExist() {
        assertEquals(-1,  lastIndex.lastIndexDrill(new int[]{1, 2, 3}, 8));
    }

    @Test
    void shouldHandleSingleElementArray() {
        assertEquals(0,  lastIndex.lastIndexDrill(new int[]{7}, 7));
    }

    @Test
    void shouldHandleEmptyArray() {
        assertEquals(-1,  lastIndex.lastIndexDrill(new int[]{}, 7));
    }
}