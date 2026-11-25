package drill;

public class IsSorted02 {
    public boolean isSorted(int[] nums) {
        if(nums.length <= 1) return true;
        else return helperIsSorted(nums,0);
    }

    private boolean helperIsSorted(int [] nums, int index){
        if(index+1 < nums.length){
            if(nums[index] > nums[index+1] ) return false;
            else return helperIsSorted(nums,index+1);}
        else return true;

    }
}
