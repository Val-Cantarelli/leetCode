package prepInterviewOA;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void testExample1() {
        TwoSum solution = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testExample2() {
        TwoSum solution = new TwoSum();

        int[] nums = {3, 2, 4};
        int target = 6;

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void testExample3() {
        TwoSum solution = new TwoSum();

        int[] nums = {3, 3};
        int target = 6;

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(new int[]{0, 1}, result);
    }

}