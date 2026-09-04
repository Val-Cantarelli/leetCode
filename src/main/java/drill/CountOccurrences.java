package drill;

public class CountOccurrences {
    public int countOccurrences(int []array, int target){
        return helperCount(array, target, 0);
    }
    private int helperCount(int[] nums, int target, int index){
        if(index == nums.length) return 0;
        if(nums[index] == target){
            return helperCount(nums,target,index+1) +1;
        }
        // do nothing
        return helperCount(nums,target,index+1);

    }
}
