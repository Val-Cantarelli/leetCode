package neetCode150;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentTest {

    private final TopKFrequent solution = new TopKFrequent();

    @Test
    void shouldReturnTopKFrequentElements() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = solution.topKFrequent(nums, k);

        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void shouldReturnSingleMostFrequentElement() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 1;

        int[] result = solution.topKFrequent(nums, k);

        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    void shouldHandleNegativeNumbers() {
        int[] nums = {-1, -1, -1, 2, 2, 3};
        int k = 2;

        int[] result = solution.topKFrequent(nums, k);

        assertArrayEquals(new int[]{-1, 2}, result);
    }

    @Test
    void shouldHandleAllElementsWithSameFrequency() {
        int[] nums = {1, 2, 3, 4};
        int k = 2;

        int[] result = solution.topKFrequent(nums, k);

        assertEquals(2, result.length);
        assertTrue(result[0] >= 1 && result[0] <= 4);
        assertTrue(result[1] >= 1 && result[1] <= 4);
        assertNotEquals(result[0], result[1]);
    }

    @Test
    void shouldHandleKEqualToNumberOfUniqueElements() {
        int[] nums = {1, 1, 2, 2, 3, 3};
        int k = 3;

        int[] result = solution.topKFrequent(nums, k);

        assertEquals(3, result.length);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }
}