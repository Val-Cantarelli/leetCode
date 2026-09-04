package drill;

public class CountOccurrencesDrill {
    public int countOccurrencesDrill(int[] nums, int target){
        return helperCounter(nums,target,0);
    }
    private int helperCounter(int []nums, int target, int index){
        if (index == nums.length) return 0;
        if(nums[index] == target) return helperCounter(nums,target,++index)+1;
        return helperCounter(nums,target,++index);
    }
}
