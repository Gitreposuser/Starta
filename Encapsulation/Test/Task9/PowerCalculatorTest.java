package Task9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerCalculatorTest {
    @Test
    void exponentiation2in10() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        PowerCalculator test = new PowerCalculator();

        // Act - do the actual calc or method run
        long actualValue = test.exponentiation(2, 10);
        long expectedValue = 1024;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void exponentiation3in3() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        PowerCalculator test = new PowerCalculator();

        // Act - do the actual calc or method run
        long actualValue = test.exponentiation(3, 3);
        long expectedValue = 27;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }
}