package neetCode150;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveTest {

    private final LongestConsecutive solution = new LongestConsecutive();

    @Test
    void shouldFindLongestConsecutiveSequence() {
        int[] nums = {100, 4, 200, 1, 3, 2};

        int result = solution.longestConsecutive(nums);

        assertEquals(4, result);
    }

    @Test
    void shouldHandleSequenceWithDuplicates() {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        int result = solution.longestConsecutive(nums);

        assertEquals(9, result);
    }

    @Test
    void shouldReturnZeroForEmptyArray() {
        int[] nums = {};

        int result = solution.longestConsecutive(nums);

        assertEquals(0, result);
    }

    @Test
    void shouldReturnOneForSingleElement() {
        int[] nums = {10};

        int result = solution.longestConsecutive(nums);

        assertEquals(1, result);
    }

    @Test
    void shouldHandleNegativeNumbers() {
        int[] nums = {-3, -2, -1, 5, 6};

        int result = solution.longestConsecutive(nums);

        assertEquals(3, result);
    }

    @Test
    void shouldChooseLongestAmongMultipleSequences() {
        int[] nums = {1, 2, 3, 10, 11, 20, 21, 22, 23};

        int result = solution.longestConsecutive(nums);

        assertEquals(4, result);
    }
}