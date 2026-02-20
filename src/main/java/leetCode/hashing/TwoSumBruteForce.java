package leetCode.hashing;

public class TwoSumBruteForce {
    public int[] twoSum(int[] nums, int target) {
        for (int indexNum = 0; indexNum < nums.length ; indexNum++) {
            for (int indexComplement = indexNum+1; indexComplement < nums.length; indexComplement++) {
                if(nums[indexNum] + nums[indexComplement] == target) return new int[]{indexNum,indexComplement};
            }
        }throw new IllegalStateException("No solution");
    }
}
