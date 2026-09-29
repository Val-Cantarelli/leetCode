package drill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeDrillTest {

    private final ValidPalindromeDrill solution =
            new ValidPalindromeDrill();

    @Test
    void acceptsEmptyString() {
        assertTrue(solution.isPalindrome(""));
    }

    @Test
    void acceptsSingleCharacter() {
        assertTrue(solution.isPalindrome("a"));
    }

    @Test
    void rejectsTwoDifferentCharacters() {
        assertFalse(solution.isPalindrome("ab"));
    }

    @Test
    void acceptsEvenAndOddLengthPalindromes() {
        assertTrue(solution.isPalindrome("abba"));
        assertTrue(solution.isPalindrome("radar"));
    }

    @Test
    void ignoresCaseSpacesAndPunctuation() {
        assertTrue(solution.isPalindrome(
                "A man, a plan, a canal: Panama"));
    }

    @Test
    void skipsMultipleSymbolsOnTheRight() {
        assertTrue(solution.isPalindrome("aa.,!?"));
    }

    @Test
    void skipsMultipleSymbolsOnTheLeft() {
        assertTrue(solution.isPalindrome("!?.,aa"));
    }

    @Test
    void acceptsOnlySymbols() {
        assertTrue(solution.isPalindrome(" .,!? "));
    }

    @Test
    void includesDigitsInComparison() {
        assertTrue(solution.isPalindrome("1aA1"));
        assertFalse(solution.isPalindrome("0P"));
    }

    @Test
    void rejectsMismatchInsideString() {
        assertFalse(solution.isPalindrome("abca"));
    }
}