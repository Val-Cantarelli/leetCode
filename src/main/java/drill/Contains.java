package drill;

public class Contains {
    public boolean contains(int[] nums, int target){
        return helperContains(nums, target,0);


    }

    private boolean helperContains(int[] nums, int target, int index) {
        if(index >= nums.length) return false;
        if(nums[index] == target) return true;
        return helperContains(nums,target,index+1);
    }
}
