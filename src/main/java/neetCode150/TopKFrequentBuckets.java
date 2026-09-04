package neetCode150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Approach: Bucket Sort
 * 1. Count frequency of each number (HashMap: num -> freq)
 * 2. Create buckets indexed by frequency (0 to nums.length)
 * 3. Place each number into buckets[freq]
 * 4. Walk buckets from highest to lowest frequency, collecting until k elements
 *
 * Time: O(n) — no sorting, linear passes only
 * Space: O(n) — map + buckets store all unique elements
 */
public class TopKFrequentBuckets {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer>  freqMap = new HashMap<>();
        for(int num:nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        List<Integer>[] buckets = new List[nums.length+1];
        for(int i = 0; i < buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }


        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            buckets[freq].add(num);
        }

        int[] result = new int[k];
        int i = 0;
        for(int freq = buckets.length-1; freq >=0 && i < k ;freq--){
            for(int num:buckets[freq]){
                result[i] = num;
                i++;
            }
        }
        return result;
    }
}
