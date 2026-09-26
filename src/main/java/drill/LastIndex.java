package drill;

public class LastIndex {
    public int lastIndex(int[] nums, int target){
        return helperLastIndex(nums, target,nums.length-1);
    }

    private int helperLastIndex(int[] nums, int target, int index) {
        if(index < 0) return -1;
        if(nums[index] == target) return index;
        return helperLastIndex(nums,target,index -1);
    }
}
