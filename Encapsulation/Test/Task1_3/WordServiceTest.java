package Task1_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WordServiceTest {
    @Test
    void wordServiceTestAA() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        WordService test = new WordService();

        String text = " v b n aa cc aa cc aaa aaa";
        char separator = ' ';
        // Act - do the actual calc or method run
        String actualValue = test.findMostFrequentWord(text, separator);
        String expectedValue = "aa";

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void getWordsCountTest10() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        WordService test = new WordService();

        String text = " 0 1 2 3 4 5 6 7 8 9";
        char separator = ' ';
        // Act - do the actual calc or method run
        //int actualValue = test.
        //int expectedValue = 10;

        // Assert - check if actual val is equal to expected val
        //Assertions.assertEquals(expectedValue, actualValue);
    }
}