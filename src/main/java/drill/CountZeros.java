package drill;

public class CountZeros {
    public int countZeros(int[] nums){
        return helperCountZeros(nums,0);
    }

    private int helperCountZeros(int[] nums, int index) {
        if(index >= nums.length) return 0;
        if(nums[index] == 0) return helperCountZeros(nums,index+1) + 1;
        else{
            return helperCountZeros(nums,index+1);
        }

    }
}
