package drill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOccurrences02Test {


    private final CountOccurrences counter = new CountOccurrences();

    @Test
    void emptyArray() {
        assertEquals(0, counter.countOccurrences(
                new int[]{}, 2));
    }

    @Test
    void targetNotFound() {
        assertEquals(0, counter.countOccurrences(
                new int[]{1, 3, 4, 5}, 2));
    }

    @Test
    void singleElementMatchingTarget() {
        assertEquals(1, counter.countOccurrences(
                new int[]{2}, 2));
    }

    @Test
    void singleElementNotMatchingTarget() {
        assertEquals(0, counter.countOccurrences(
                new int[]{5}, 2));
    }

    @Test
    void multipleOccurrences() {
        assertEquals(3, counter.countOccurrences(
                new int[]{2, 1, 2, 3, 2}, 2));
    }

    @Test
    void allElementsMatchingTarget() {
        assertEquals(4, counter.countOccurrences(
                new int[]{2, 2, 2, 2}, 2));
    }

    @Test
    void negativeTarget() {
        assertEquals(2, counter.countOccurrences(
                new int[]{-1, 0, -1, 3}, -1));
    }
}

