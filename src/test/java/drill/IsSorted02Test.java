package drill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSorted02Test {
    private final IsSorted02 solution = new IsSorted02();

    @Test
    void testAscendingArray(){
        assertTrue(solution.isSorted(new int[]{-3,8}));
    }

    @Test
    void testDescendingArray(){
        assertFalse(solution.isSorted(new int[]{5,3,1}));
    }

    @Test
    void testEmptyArray() {
        assertTrue(solution.isSorted(new int[]{}));
    }

    @Test
    void testSingleElement() {
        assertTrue(solution.isSorted(new int[]{7}));
    }
    @Test
    void testEqualElements() {
        assertTrue(solution.isSorted(new int[]{0, 0, 0}));
    }

    @Test
    void testInversionInMiddle(){
        assertFalse(solution.isSorted(new int[]{1,2,3,6,4,5}));
    }

    @Test
    void testInversionAtEnd(){
        assertFalse(solution.isSorted(new int[]{2,3,5,1}));
    }
}