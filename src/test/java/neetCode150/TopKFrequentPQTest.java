package neetCode150;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TopKFrequentPQTest {

    @Test
    void returnsTopKFrequentElements() {
        TopKFrequentPQ solution = new TopKFrequentPQ();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = solution.topKFrequent(nums, k);

        // ordem não importa, então comparamos como conjunto
        Set<Integer> resultSet = new HashSet<>();
        for (int n : result) resultSet.add(n);

        assertEquals(2, result.length);
        assertEquals(Set.of(1, 2), resultSet);
    }

    @Test
    void handlesSingleElement() {
        TopKFrequentPQ solution = new TopKFrequentPQ();
        int[] nums = {1};
        int k = 1;

        int[] result = solution.topKFrequent(nums, k);

        assertEquals(1, result.length);
        assertEquals(1, result[0]);
    }
}