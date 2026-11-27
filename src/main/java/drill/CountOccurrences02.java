package drill;

public class CountOccurrences02 {
    public int countOccurrences(int[] nums, int target) {
        return helperCountOccurrences(nums,target,0);

    }
    private int helperCountOccurrences(int[] nums, int target, int index){
        if(index >= nums.length) return 0;
        if(nums[index] == target) return helperCountOccurrences(nums, target, index+1) + 1;
        return helperCountOccurrences(nums, target, index + 1);
    }

}
