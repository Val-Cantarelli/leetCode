package drill;

public class SumDrill {
    public int sumDrill(int [] nums){
        return helperSum(nums,0);
    }
    private int helperSum(int[] nums, int index){
        if(index == nums.length) return 0;
        return nums[index] + helperSum(nums, ++index);
    }
}
