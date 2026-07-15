package leetCode.hashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsAnagramTest {

    private final IsAnagram solution = new IsAnagram();

    @Test
    void shouldReturnTrueForSimpleAnagram() {
        assertTrue(solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    void shouldReturnFalseForNonAnagram() {
        assertFalse(solution.isAnagram("rat", "car"));
    }

    @Test
    void shouldReturnFalseWhenLengthsDiffer() {
        // t shorter than s -- the case you identified earlier
        assertFalse(solution.isAnagram("ab", "a"));
    }

    @Test
    void shouldReturnFalseWhenTHasExtraRepeatedLetters() {
        // t has a letter repeated more times than in s
        assertFalse(solution.isAnagram("aab", "aabb"));
    }

    @Test
    void shouldReturnTrueForEmptyStrings() {
        assertTrue(solution.isAnagram("", ""));
    }

    @Test
    void shouldBeCaseSensitive() {
        // LeetCode assumes lowercase input, but worth confirming your code's actual behavior
        assertFalse(solution.isAnagram("Anagram", "nagaram"));
    }
}