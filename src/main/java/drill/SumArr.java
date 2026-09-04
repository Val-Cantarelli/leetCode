package drill;

public class SumArr {
    public int sumArr(int []nums){
        return helperSum(nums,0);
    }

    //helper with index
    private int helperSum(int []nums, int index){
        if(index == nums.length) return 0;
        return  nums[index] + helperSum(nums, index+1);
    }
}
