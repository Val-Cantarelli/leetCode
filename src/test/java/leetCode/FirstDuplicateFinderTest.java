package leetCode;

import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstDuplicateFinderTest {
    @Test
    public void testWithDuplicates() {
        List<Integer> input = List.of(2,5,7,9,0,2,4,6);
        int result = FirstDuplicateFinder.findFirstDuplicate(input);
        assertEquals(2,result);
    }

    @Test
    public void testWithoutDuplicates(){
        List<Integer> input = List.of(1,2,3,4,5);
        int result = FirstDuplicateFinder.findFirstDuplicate(input);
        assertEquals(-1,result);
    }
    @Test
    public void testEmptyList(){
        List<Integer> input = List.of();
        int result = FirstDuplicateFinder.findFirstDuplicate(input);
        assertEquals(-1,result);
    }

    @Test
    public void testSingleElement(){
        List<Integer> input = List.of(43);
        int result = FirstDuplicateFinder.findFirstDuplicate(input);
        assertEquals(-1,result);
    }
    @Test
    public void testImmediateDuplicate(){
        List<Integer> input = List.of(43,43,1,2);
        int result = FirstDuplicateFinder.findFirstDuplicate(input);
        assertEquals(43,result);
    }


}