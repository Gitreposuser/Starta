package Task4_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// ******************
// *** Task 4 - 5 ***
// ******************

public class DayOfTheWeekSwitchTest {
    @Test
    void DaysOfTheWeekSwitchNonExistingDay(){
        DayOfTheWeekDetectorSwitchVersion calendar =
                new DayOfTheWeekDetectorSwitchVersion();

        String expectedValue = "Please input a valid number between 1 and 7";
        String actualValue = calendar.detectDayName(8);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void DaysOfTheWeekSwitchTestMonday(){
        DayOfTheWeekDetectorSwitchVersion calendar =
                new DayOfTheWeekDetectorSwitchVersion();

        String expectedValue = "Monday";
        String actualValue = calendar.detectDayName(1);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void DaysOfTheWeekSwitchTestFriday(){
        DayOfTheWeekDetectorSwitchVersion calendar =
                new DayOfTheWeekDetectorSwitchVersion();

        String expectedValue = "Friday";
        String actualValue = calendar.detectDayName(5);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void DaysOfTheWeekSwitchTestSunday(){
        DayOfTheWeekDetectorSwitchVersion calendar =
                new DayOfTheWeekDetectorSwitchVersion();

        String expectedValue = "Sunday";
        String actualValue = calendar.detectDayName(7);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void DaysOfTheWeakSwitchNonExistingDay(){
        DayOfTheWeekDetectorSwitchVersion calendar =
                new DayOfTheWeekDetectorSwitchVersion();

        String expectedValue = "Please input a valid number between 1 and 7";
        String actualValue = calendar.detectDayName(8);

        Assertions.assertEquals(expectedValue, actualValue);
    }
}
