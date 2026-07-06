package leetCode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxAreaTest {

    private final MaxArea solution = new MaxArea();

    @Test
    void example1() {
        assertEquals(49,
                solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    @Test
    void example2() {
        assertEquals(1,
                solution.maxArea(new int[]{1,1}));
    }

    @Test
    void increasingHeights() {
        assertEquals(6,
                solution.maxArea(new int[]{1,2,3,4,5}));
    }

    @Test
    void decreasingHeights() {
        assertEquals(6,
                solution.maxArea(new int[]{5,4,3,2,1}));
    }

    @Test
    void allSameHeight() {
        assertEquals(20,
                solution.maxArea(new int[]{5,5,5,5,5}));
    }

    @Test
    void singlePeak() {
        assertEquals(16,
                solution.maxArea(new int[]{4,3,2,1,4}));
    }

    @Test
    void anotherCase() {
        assertEquals(2,
                solution.maxArea(new int[]{1,2,1}));
    }
}