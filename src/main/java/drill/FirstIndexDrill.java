package drill;

public class FirstIndexDrill {
    public int firstIndexDrill(int[] nums, int target){
        return helperFirstIndex(nums,target,0);
    }

    private int helperFirstIndex(int[] nums, int target, int index){
        if( index >= nums.length) return -1;
        if(nums[index] == target) return index;
        return helperFirstIndex(nums,target,index+1);
    }
}
