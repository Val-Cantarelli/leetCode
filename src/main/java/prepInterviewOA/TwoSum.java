package prepInterviewOA;
// EASY - AMAZON LeetCode
/*First: dumb way
public class TwoSum {
    public int [] twoSum(int []nums, int target){

        for(int i = 0; i < nums.length; i ++){
            for(int j = nums.length -1; j != i; j--){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalStateException("No two elements sum to target");
    }
}
*/

import java.util.HashMap;
import java.util.Map;

// Using a HashMap to find the complementary
public class TwoSum {
    public int [] twoSum(int []nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        int [] arr = new int[2];

        for(int i = 0; i < nums.length; i++){
            Integer complement = target - nums[i];
            if(map.containsKey(complement)){
                arr[0] = map.get(complement);
                arr[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return arr;
    }
}