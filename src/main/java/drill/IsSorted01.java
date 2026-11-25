
package drill;

public class IsSorted01 {
    public boolean isSorted(int[] nums){
        return helperSort(nums, 0);
    }

    private boolean helperSort(int[] nums, int index) {
        if(index >= nums.length || nums.length == 0) return true;
        return  helperSort(nums,index+1);
    }
}
