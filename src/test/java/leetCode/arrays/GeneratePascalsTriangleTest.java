package leetCode.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GeneratePascalsTriangleTest {

    @Test
    void shouldReturnOneRowWhenNumRowsIsOne() {
        GeneratePascalsTriangle solution = new GeneratePascalsTriangle();

        List<List<Integer>> expected = List.of(
                List.of(1)
        );

        assertEquals(expected, solution.generate(1));
    }

    @Test
    void shouldReturnTwoRowsWhenNumRowsIsTwo() {
        GeneratePascalsTriangle solution = new GeneratePascalsTriangle();

        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1)
        );

        assertEquals(expected, solution.generate(2));
    }

    @Test
    void shouldReturnFiveRowsWhenNumRowsIsFive() {
        GeneratePascalsTriangle solution = new GeneratePascalsTriangle();

        List<List<Integer>> expected = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        );

        assertEquals(expected, solution.generate(5));
    }
}