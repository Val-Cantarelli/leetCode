package leetCode.arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int indexNums = 0; indexNums < nums.length; indexNums++ ){
            int complement = target - nums[indexNums];
            if(map.containsKey(complement)) return new int[]{map.get(complement), indexNums};
            map.put(nums[indexNums], indexNums);
        }

        throw new IllegalStateException("No solution");
    }
}

