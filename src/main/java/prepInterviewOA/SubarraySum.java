package prepInterviewOA;

/* Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
* Ps.: A subarray is a contiguous non-empty sequence of elements within an array.
* Constraints:
* 1 <= nums.length <= 2 * 104
* -1000 <= nums[i] <= 1000
* -107 <= k <= 107
* */

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public int subarraySum(int []nums, int k){
        int totalSubarrays = 0;
        int acc =0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i = 0; i < nums.length; i++){
                acc = acc +nums[i];
                int prefixSearch = acc - k;
                totalSubarrays = totalSubarrays + map.getOrDefault(prefixSearch,0);

                map.put(acc,map.getOrDefault(acc,0)+1);
        }
        return totalSubarrays;
    }
}
