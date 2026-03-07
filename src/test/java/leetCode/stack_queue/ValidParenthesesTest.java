package leetCode.stack_queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    private final ValidParentheses solution = new ValidParentheses();

    @Test
    void shouldReturnTrueForEmptyString() {
        assertTrue(solution.isValid(""));
    }

    @Test
    void shouldReturnTrueForSingleValidPair() {
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("[]"));
        assertTrue(solution.isValid("{}"));
    }

    @Test
    void shouldReturnTrueForMultipleValidPairs() {
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void shouldReturnTrueForNestedValidParentheses() {
        assertTrue(solution.isValid("{[()]}"));
        assertTrue(solution.isValid("{{}}[[]]()"));
    }

    @Test
    void shouldReturnFalseWhenClosingComesFirst() {
        assertFalse(solution.isValid(")"));
        assertFalse(solution.isValid("}]]]]"));
    }

    @Test
    void shouldReturnFalseForWrongClosingOrder() {
        assertFalse(solution.isValid("(]"));
        assertFalse(solution.isValid("{[()}]"));
    }

    @Test
    void shouldReturnFalseWhenThereAreUnclosedOpenings() {
        assertFalse(solution.isValid("("));
        assertFalse(solution.isValid("((("));
        assertFalse(solution.isValid("{[("));
    }

    @Test
    void shouldReturnFalseWhenThereAreExtraClosings() {
        assertFalse(solution.isValid("())"));
        assertFalse(solution.isValid("{[]}}"));
    }
}