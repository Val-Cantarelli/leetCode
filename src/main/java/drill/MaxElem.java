package drill;

public class MaxElem {
    public int maxElem(int [] nums){
        if (nums.length == 0) {
            throw new IllegalArgumentException("Array nums can't be empty");}
        return helperMax(nums, 1,nums[0]);
    }

    private int helperMax(int[] nums, int index, int maxSoFar) {
        if(index == nums.length) return maxSoFar;
        if(nums[index] > maxSoFar) maxSoFar = nums[index];
        return helperMax(nums, index+1, maxSoFar);
    }

}
