package drill;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainsTest {

    private Contains contains;

    @BeforeEach
    void setUp() {
        contains = new Contains();
    }

    @Test
    void shouldReturnTrueWhenTargetExists() {
        assertTrue(contains.contains(new int[]{4, 8, 2, 9}, 2));
    }

    @Test
    void shouldReturnFalseWhenTargetDoesNotExist() {
        assertFalse(contains.contains(new int[]{4, 8, 2, 9}, 5));
    }

    @Test
    void shouldFindTargetAtFirstPosition() {
        assertTrue(contains.contains(new int[]{7, 2, 3}, 7));
    }

    @Test
    void shouldFindTargetAtLastPosition() {
        assertTrue(contains.contains(new int[]{1, 2, 7}, 7));
    }

    @Test
    void shouldHandleSingleElementArray() {
        assertTrue(contains.contains(new int[]{7}, 7));
    }

    @Test
    void shouldHandleEmptyArray() {
        assertFalse(contains.contains(new int[]{}, 7));
    }
}