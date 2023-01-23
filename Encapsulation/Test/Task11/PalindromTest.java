package Task11;

import Task10.CreditCard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromTest {
    @Test
    void palindromTestSimplePalindrom() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        Palindrom test = new Palindrom();

        // Act - do the actual calc or method run
        boolean actualValue = test.isPalindrom("abccba");
        boolean expectedValue = true;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void palindromTestOdd() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        Palindrom test = new Palindrom();

        // Act - do the actual calc or method run
        boolean actualValue = test.isPalindrom("abcba");
        boolean expectedValue = true;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void palindromTestOneSymbol() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        Palindrom test = new Palindrom();

        // Act - do the actual calc or method run
        boolean actualValue = test.isPalindrom("a");
        boolean expectedValue = true;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void palindromTestRegisterSense() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        Palindrom test = new Palindrom();

        // Act - do the actual calc or method run
        boolean actualValue = test.isPalindrom("Abccba");
        boolean expectedValue = true;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void palindromNegativTest() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        Palindrom test = new Palindrom();

        // Act - do the actual calc or method run
        boolean actualValue = test.isPalindrom("aab");
        boolean expectedValue = false;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }
}