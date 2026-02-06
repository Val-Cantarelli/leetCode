package prepInterviewOA;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class IsPalindromeTest {

    private final IsPalindrome solution = new IsPalindrome();

    @Test
    void shouldReturnTrueForPalindromeNumber() {

        assertTrue(solution.isPalindrome(121));
        assertTrue(solution.isPalindrome(11));
        assertTrue(solution.isPalindrome(0));
        assertTrue(solution.isPalindrome(1221));
    }

    @Test
    void shouldReturnFalseForNonPalindromeNumber() {

        assertFalse(solution.isPalindrome(10));
        assertFalse(solution.isPalindrome(123));
        assertFalse(solution.isPalindrome(100));
    }

    @Test
    void shouldReturnFalseForNegativeNumber() {

        assertFalse(solution.isPalindrome(-121));
        assertFalse(solution.isPalindrome(-10));
    }

    @Test
    void shouldHandleSingleDigit() {

        assertTrue(solution.isPalindrome(5));
        assertTrue(solution.isPalindrome(9));
    }
}
