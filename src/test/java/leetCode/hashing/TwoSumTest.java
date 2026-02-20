package leetCode.hashing;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private static void assertTwoSum(int[] nums, int target, int[] result) {
        assertNotNull(result);
        assertEquals(2, result.length);

        int i = result[0], j = result[1];
        assertNotEquals(i, j);
        assertTrue(0 <= i && i < nums.length);
        assertTrue(0 <= j && j < nums.length);
        assertEquals(target, nums[i] + nums[j]);
    }

    private static void runAllCases(BiFunction<int[], Integer, int[]> solver) {
        assertTwoSum(new int[]{2,7,11,15}, 9, solver.apply(new int[]{2,7,11,15}, 9));
        assertTwoSum(new int[]{3,2,4}, 6, solver.apply(new int[]{3,2,4}, 6));
        assertTwoSum(new int[]{3,3}, 6, solver.apply(new int[]{3,3}, 6));
    }

    @Test
    void examples_work_for_all_implementations() {
        runAllCases(new TwoSum()::twoSum);
        runAllCases(new TwoSumBruteForce()::twoSum);
    }
}