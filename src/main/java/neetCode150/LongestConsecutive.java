package neetCode150;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        // create the set
        Set<Integer> set = new HashSet<>();
        for (int num:nums) set.add(num);

        // var longest
        int longest = 0;

        //find a candidate to the search
        for (int candidate:set) {
            if(!set.contains(candidate -1)){
                int longestSoFar = 0;
                // start the progressive search
                for (int j = 0; j < nums.length ; j++) {
                    if(set.contains(candidate+j)) longestSoFar++;
                    else break;
                }
                // update the longest
                if(longest < longestSoFar) longest = longestSoFar;
            }
        }
        return longest;
    }

    static void main() {
        int [] nums = new int[]{1,2,4};
        int test = new LongestConsecutive().longestConsecutive(nums);
        System.out.println(test);
    }
}
