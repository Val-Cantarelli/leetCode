package drill;

public class LastIndexDrill {
    public int lastIndexDrill(int [] nums, int target){
        return helperLastIndexDrill(nums,target, nums.length-1);
    }

    private int helperLastIndexDrill(int [] nums, int target, int index){
        if(index < 0) return -1;
        if(nums[index]==target) return index;
        else return helperLastIndexDrill(nums,target,index-1);
    }
}
