package drill;

public class FirstIndex {
    public int firstIndex(int[] nums, int target){
        return helper(nums,target,0);
    }

    private int helper(int[] nums, int target, int index) {
        // se terminar o arr e nao retornou nada antes é pq nao tem. Portanto -1
        if(index > nums.length-1) return -1;
        if(nums[index] == target) return index;
        return helper(nums,target,index+1);

    }
}
