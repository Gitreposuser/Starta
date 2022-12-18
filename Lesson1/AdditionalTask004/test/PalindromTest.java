import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromTest {

    @Test
    void levelIsPalindrom() {
        // Trpile A pattern
        // Arrange - setup test objects etc.
        Palindrom palindrom = new Palindrom();

        // Act - do the actual calc or method run
        boolean actualValue = palindrom.isPalindrom("level");
        boolean expectedValue = true;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void levElIsPalindrom() {
        // Trpile A pattern
        // Arrange - setup test objects etc.
        Palindrom palindrom = new Palindrom();

        // Act - do the actual calc or method run
        boolean actualValue = palindrom.isPalindrom("levEl");
        boolean expectedValue = true;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void aIsPalindrom() {
        // Trpile A pattern
        // Arrange - setup test objects etc.
        Palindrom palindrom = new Palindrom();

        // Act - do the actual calc or method run
        boolean actualValue = palindrom.isPalindrom("a");
        boolean expectedValue = true;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void levnelIsNotPalindrom() {
        // Trpile A pattern
        // Arrange - setup test objects etc.
        Palindrom palindrom = new Palindrom();

        // Act - do the actual calc or method run
        boolean actualValue = palindrom.isPalindrom("levnel");
        boolean expectedValue = false;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void someTextIsNotPalindrom() {
        // Trpile A pattern
        // Arrange - setup test objects etc.
        Palindrom palindrom = new Palindrom();

        // Act - do the actual calc or method run
        boolean actualValue = palindrom.isPalindrom("some text");
        boolean expectedValue = false;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }
}