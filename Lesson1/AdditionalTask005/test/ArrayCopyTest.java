import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayCopyTest {

    @Test
    void copyInRangeFrom0To5() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        ArrayCopy arrayCopy = new ArrayCopy();

        // Act - do the actual calc or method run
        int[] testArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] actualValue = arrayCopy.copyInRange(testArray,
                                            0, 5);
        int[] expectedValue = { 1, 2, 3, 4, 5 };

        // Assert - check if actual val is equal to expected val
        Assertions.assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    void copyInRangeFromMinus2To30() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        ArrayCopy arrayCopy = new ArrayCopy();

        // Act - do the actual calc or method run
        int[] testArray = new int[] { -10, -20, 3, 40, 5, 6, 17, 8, 9, 10 };
        int[] actualValue = arrayCopy.copyInRange(testArray,
                -2, 30);
        int[] expectedValue = { 3, 5, 6, 17, 8, 9, 10 };

        // Assert - check if actual val is equal to expected val
        Assertions.assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    void copyInRangeFrom30To2() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        ArrayCopy arrayCopy = new ArrayCopy();

        // Act - do the actual calc or method run
        int[] testArray = new int[] { -10, -20, 3, 40, 5, 6, 17, 8, 9, 10 };
        int[] actualValue = arrayCopy.copyInRange(testArray,
                30, 2);
        int[] expectedValue = {};

        // Assert - check if actual val is equal to expected val
        Assertions.assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    void copyInRangeFromMinus30To20() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        ArrayCopy arrayCopy = new ArrayCopy();

        // Act - do the actual calc or method run
        int[] testArray = new int[] { -10 };
        int[] actualValue = arrayCopy.copyInRange(testArray,
                -30, 20);
        int[] expectedValue = { -10 };

        // Assert - check if actual val is equal to expected val
        Assertions.assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    void copyInRangeInputEmptyArray() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        ArrayCopy arrayCopy = new ArrayCopy();

        // Act - do the actual calc or method run
        int[] testArray = new int[] {};
        int[] actualValue = arrayCopy.copyInRange(testArray,
                30, 2);
        int[] expectedValue = {};

        // Assert - check if actual val is equal to expected val
        Assertions.assertArrayEquals(expectedValue, actualValue);
    }
}