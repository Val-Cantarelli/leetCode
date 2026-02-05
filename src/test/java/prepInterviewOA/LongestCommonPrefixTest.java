package prepInterviewOA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {

    private final LongestCommonPrefix solver = new LongestCommonPrefix();

    @Test
    void testClassicExample() {
        String[] input = {"flower", "flow", "flight"};
        String expected = "fl";

        String result = solver.longestCommonPrefix(input);

        assertEquals(expected, result);
    }

    @Test
    void testNoCommonPrefix() {
        String[] input = {"dog", "racecar", "car"};
        String expected = "";

        String result = solver.longestCommonPrefix(input);

        assertEquals(expected, result);
    }

    @Test
    void testSingleString() {
        String[] input = {"alone"};
        String expected = "alone";

        String result = solver.longestCommonPrefix(input);

        assertEquals(expected, result);
    }

    @Test
    void testPrefixIsShortestString() {
        String[] input = {"cir", "circle"};
        String expected = "cir";

        String result = solver.longestCommonPrefix(input);

        assertEquals(expected, result);
    }

    @Test
    void testAllEqualStrings() {
        String[] input = {"test", "test", "test"};
        String expected = "test";

        String result = solver.longestCommonPrefix(input);

        assertEquals(expected, result);
    }

    @Test
    void testEmptyArray() {
        String[] input = {};
        String expected = "";

        String result = solver.longestCommonPrefix(input);

        assertEquals(expected, result);
    }

    @Test
    void testContainsEmptyString() {
        String[] input = {"", "abc", "abd"};
        String expected = "";

        String result = solver.longestCommonPrefix(input);

        assertEquals(expected, result);
    }

    @Test
    void testFirstIsShortest() {
        String[] input = {"ab", "abc", "abcd"};
        String expected = "ab";

        String result = solver.longestCommonPrefix(input);

        assertEquals(expected, result);
    }
}
