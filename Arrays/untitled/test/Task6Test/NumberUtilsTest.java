package Task6Test;

import Task6.NumberUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberUtilsTest {
    @Test
    void isEvenTrue() {
        NumberUtils test = new NumberUtils();

        boolean actualValue = test.isEven(2);
        boolean expectedValue = true;

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void isEvenFalse() {
        NumberUtils test = new NumberUtils();

        boolean actualValue = test.isEven(1);
        boolean expectedValue = false;

        Assertions.assertEquals(expectedValue, actualValue);
    }
}
