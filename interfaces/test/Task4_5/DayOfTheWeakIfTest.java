package Task4_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// ******************
// *** Task 4 - 5 ***
// ******************

public class DayOfTheWeakIfTest {
    @Test
    void DaysOfTheWeekIfTestNonExistedDay(){
        DayOfTheWeekDetectorIfVersion calendar =
                new DayOfTheWeekDetectorIfVersion();

        String expectedValue = "Please input a valid number between 1 and 7";
        String actualValue = calendar.detectDayName(0);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void DaysOfTheWeekIfTestMonday(){
        DayOfTheWeekDetectorIfVersion calendar =
                new DayOfTheWeekDetectorIfVersion();

        String expectedValue = "Monday";
        String actualValue = calendar.detectDayName(1);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void DaysOfTheWeekIfTestFriday(){
        DayOfTheWeekDetectorIfVersion calendar =
                new DayOfTheWeekDetectorIfVersion();

        String expectedValue = "Friday";
        String actualValue = calendar.detectDayName(5);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void DaysOfTheWeekIfTestSunday(){
        DayOfTheWeekDetectorIfVersion calendar =
                new DayOfTheWeekDetectorIfVersion();

        String expectedValue = "Sunday";
        String actualValue = calendar.detectDayName(7);

        Assertions.assertEquals(expectedValue, actualValue);
    }
}
