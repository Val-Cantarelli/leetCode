package prepInterviewOA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubarraySumTest {

    private SubarraySum solver;

    @BeforeEach
    void setUp() {
        solver = new SubarraySum();
    }

    @Test
    void testBasicExample() {
        // [1, 1, 1], k = 2 -> Subarrays: [1,1] e [1,1]
        int[] nums = {1, 1, 1};
        assertEquals(2, solver.subarraySum(nums, 2));
    }

    @Test
    void testDifferentNumbers() {
        // [1, 2, 3], k = 3 -> Subarrays: [1,2] e [3]
        int[] nums = {1, 2, 3};
        assertEquals(2, solver.subarraySum(nums, 3));
    }

    @Test
    void testNegativeNumbers() {
        // [1, -1, 0], k = 0 -> Subarrays: [1,-1], [0], [1,-1,0]
        int[] nums = {1, -1, 0};
        assertEquals(3, solver.subarraySum(nums, 0));
    }

    @Test
    void testNoMatch() {
        int[] nums = {1, 2, 3};
        assertEquals(0, solver.subarraySum(nums, 10));
    }

    @Test
    void testSingleElementMatch() {
        int[] nums = {5};
        assertEquals(1, solver.subarraySum(nums, 5));
    }
}