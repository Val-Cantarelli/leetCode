package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumHash {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] targetIndex = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                targetIndex[0] = map.get(complement);
                targetIndex[1]= i;
            }
            else map.put(nums[i],i);
        }
        return targetIndex;
    }

    public static void main(String[] args) {
        int [] nums = {2,4,5,9,1};
        int target = 3;
        System.out.println(Arrays.toString(new TwoSumHash().twoSum(nums, target)));
    }
}
