package neetCode150;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private final TwoSum solution = new TwoSum();

    @Test
    void findsPairAtBeginning() {
        assertArrayEquals(
                new int[]{1, 2},
                solution.twoSum(new int[]{2, 7, 11, 15}, 9)
        );
    }

    @Test
    void findsPairAtOppositeEnds() {
        assertArrayEquals(
                new int[]{1, 4},
                solution.twoSum(new int[]{1, 2, 4, 8}, 9)
        );
    }

    @Test
    void findsPairInMiddle() {
        assertArrayEquals(
                new int[]{2, 3},
                solution.twoSum(new int[]{1, 3, 5, 10}, 8)
        );
    }

    @Test
    void findsPairAtEnd() {
        assertArrayEquals(
                new int[]{3, 4},
                solution.twoSum(new int[]{1, 2, 4, 7}, 11)
        );
    }

    @Test
    void handlesTwoElements() {
        assertArrayEquals(
                new int[]{1, 2},
                solution.twoSum(new int[]{-1, 0}, -1)
        );
    }

    @Test
    void handlesDuplicateValuesAtDifferentIndices() {
        assertArrayEquals(
                new int[]{1, 2},
                solution.twoSum(new int[]{3, 3}, 6)
        );
    }

    @Test
    void handlesNegativeNumbers() {
        assertArrayEquals(
                new int[]{1, 3},
                solution.twoSum(new int[]{-8, -5, -3, -1}, -11)
        );
    }

    @Test
    void handlesZeroTarget() {
        assertArrayEquals(
                new int[]{2, 5},
                solution.twoSum(new int[]{-7, -3, 0, 2, 3}, 0)
        );
    }

    @Test
    void doesNotReuseSameElement() {
        assertArrayEquals(
                new int[]{2, 4},
                solution.twoSum(new int[]{1, 2, 3, 4}, 6)
        );
    }
}