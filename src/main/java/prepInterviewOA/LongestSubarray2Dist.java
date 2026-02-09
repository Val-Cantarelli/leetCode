package prepInterviewOA;
import java.util.HashMap;
import java.util.Map;


public class LongestSubarray2Dist {
    public int longestSubarray2Dist(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        int max= 0;
        int secondMax = 0;


        for(int i = 0; i< nums.length; i++){

            map.put(nums[i],map.get(nums[i])+1);
            int number = map.get(nums[i]);
            if(number > max) {
                max = number;
                secondMax = max;
            } else if (number < max && number > secondMax) {
                secondMax = number;
            }
        }
        return max + secondMax;
    }
}
