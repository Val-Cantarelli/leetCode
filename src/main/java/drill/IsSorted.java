package drill;

public class IsSorted {
    public boolean isSorted(int [] nums){
        return helper(nums,0);
    }

    private boolean helper(int [] nums, int index){
        if(index >= nums.length - 1) return true;
        if(nums[index] > nums[index+1] ) return false;
        return helper(nums,++index);

    }

    static void main() {
        int [] nums = new int[]{};
        boolean test = new IsSorted().isSorted(nums);
        System.out.println(test);
    }
}
