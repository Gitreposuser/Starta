package Task10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CreditCardTest {
    @Test
    void depositTest1000() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        CreditCard test = new CreditCard();
        final long cardId = 1;
        final int pincode = 1111;
        test.initCreditCard(cardId, pincode);

        // Act - do the actual calc or method run
        test.deposit(pincode, 1000);
        double actualValue = test.getBalance();
        double expectedValue = 1000;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void depositTest11_1() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        CreditCard test = new CreditCard();
        final long cardId = 1;
        final int pincode = 1111;
        test.initCreditCard(cardId, pincode);

        // Act - do the actual calc or method run
        test.deposit(pincode, 11.1);
        double actualValue = test.getBalance();
        double expectedValue = 11.1;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void depositTestWrongPinCode() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        CreditCard test = new CreditCard();
        final long cardId = 1;
        final int pincode = 1111;
        test.initCreditCard(cardId, pincode);

        // Act - do the actual calc or method run
        test.deposit(0000, 11.1);
        double actualValue = test.getBalance();
        double expectedValue = 0;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void withdrawTest900Balance() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        CreditCard test = new CreditCard();
        final long cardId = 1;
        final int pincode = 1111;
        test.initCreditCard(cardId, pincode);

        // Act - do the actual calc or method run
        test.withdraw(1111, 900);
        double actualValue = test.getBalance();
        double expectedValue = 0;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void withdrawTest900Debt() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        CreditCard test = new CreditCard();
        final long cardId = 1;
        final int pincode = 1111;
        test.initCreditCard(cardId, pincode);

        // Act - do the actual calc or method run
        test.withdraw(1111, 900);
        double actualValue = test.getDebt();
        double expectedValue = 900;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void setCreditLimitTestBaseValue() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        CreditCard test = new CreditCard();
        final long cardId = 1;
        final int pincode = 1111;
        test.initCreditCard(cardId, pincode);

        // Act - do the actual calc or method run
        double actualValue = test.getCreditLimit();
        double expectedValue = 1000;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void setCreditLimitTest500() {
        // Triple A pattern
        // Arrange - setup test objects etc.
        CreditCard test = new CreditCard();
        final long cardId = 1;
        final int pincode = 1111;
        test.initCreditCard(cardId, pincode);
        test.setCreditLimit(1111, 500);

        // Act - do the actual calc or method run
        double actualValue = test.getCreditLimit();
        double expectedValue = 500;

        // Assert - check if actual val is equal to expected val
        Assertions.assertEquals(expectedValue, actualValue);
    }
}