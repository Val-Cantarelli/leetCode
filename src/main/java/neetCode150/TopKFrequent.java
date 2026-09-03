package neetCode150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Approach: Sort
 * 1. Count frequency of each number (HashMap: num -> freq)
 * 2. Convert map entries to a list
 * 3. Sort descending by frequency
 * 4. Take first k entries
 *
 * Time:O(n log n) — sort dominates
 * Space: O(n)
 */
public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for(int num:nums){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(frequencyMap.entrySet());

        list.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());
        int[] result = new int[k];
        for(int i =0; i< k; i++){
            result[i] = list.get(i).getKey();
        }

        return result;

    }
}
