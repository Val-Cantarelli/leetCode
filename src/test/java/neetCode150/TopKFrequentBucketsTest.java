package neetCode150;

import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TopKFrequentBucketsTest {

    @Test
    void returnsTopKFrequentElements() {
        TopKFrequentBuckets solution = new TopKFrequentBuckets();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = solution.topKFrequent(nums, k);

        Set<Integer> resultSet = new HashSet<>();
        for (int n : result) resultSet.add(n);

        assertEquals(2, result.length);
        assertEquals(Set.of(1, 2), resultSet);
    }

    @Test
    void handlesAllSameElement() {
        TopKFrequentBuckets solution = new TopKFrequentBuckets();
        int[] nums = {5, 5, 5, 5};
        int k = 1;

        int[] result = solution.topKFrequent(nums, k);

        assertEquals(1, result.length);
        assertEquals(5, result[0]);
    }
}