package drill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstIndexDrillTest {
    //FirstIndexDrill solution = new FirstIndexDrill();
    private final FirstIndexDrill firstIndex = new FirstIndexDrill();



    @Test
    void shouldReturnFirstIndexWhenTargetExists() {
        int[] nums = {4, 2, 7, 2, 9};

        assertEquals(1, firstIndex.firstIndexDrill(nums, 2));
    }

    @Test
    void shouldReturnZeroWhenTargetIsFirstElement() {
        int[] nums = {5, 3, 8, 1};

        assertEquals(0, firstIndex.firstIndexDrill(nums, 5));
    }

    @Test
    void shouldReturnLastIndexWhenTargetIsLastElement() {
        int[] nums = {5, 3, 8, 1};

        assertEquals(3, firstIndex.firstIndexDrill(nums, 1));
    }

    @Test
    void shouldReturnMinusOneWhenTargetDoesNotExist() {
        int[] nums = {1, 2, 3, 4};

        assertEquals(-1, firstIndex.firstIndexDrill(nums, 10));
    }

    @Test
    void shouldReturnMinusOneForEmptyArray() {
        int[] nums = {};

        assertEquals(-1, firstIndex.firstIndexDrill(nums, 5));
    }

    @Test
    void shouldReturnFirstOccurrenceWhenTargetAppearsMultipleTimes() {
        int[] nums = {1, 7, 3, 7, 7};

        assertEquals(1, firstIndex.firstIndexDrill(nums, 7));
    }

}