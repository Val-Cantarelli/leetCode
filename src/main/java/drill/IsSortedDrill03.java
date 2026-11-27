package drill;

public class IsSortedDrill03 {
    public boolean isSorted(int[] nums) {
        return helperSorted(nums,0);
    }
    private boolean helperSorted(int[] nums, int index ){
        if(index >= nums.length-1) return true;
        if(nums[index] > nums[index+1]) return false;
        return helperSorted(nums, index+1);
    }
}
