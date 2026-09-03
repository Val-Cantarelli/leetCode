package neetCode150;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Approach: Min-Heap (size k)
 * 1. Count frequency of each number (HashMap: num -> freq)
 * 2. Push entries into a min-heap ordered by frequency
 * 3. If heap size exceeds k, remove the smallest (poll)
 * 4. Drain the heap into the result array

 * Time: O(n log k) — heap operations bounded by size k
 * Space: O(n) — map stores all unique elements
 */
public class TopKFrequentPQ {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for(int num:nums){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }
        // PQ with lambda on constructor
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((entryA, entryB) -> entryA.getValue() - entryB.getValue());
        for(Map.Entry<Integer,Integer> entry:frequencyMap.entrySet()){
            minHeap.add(entry);
            if(minHeap.size() > k){minHeap.poll();}
        }

        int[] result = new int[k];
        int i=0;
        while(!minHeap.isEmpty()){
            result[i] = minHeap.poll().getKey();
            i++;
        }
        return result;
    }
}
