package Task4_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// ******************
// *** Task 4 - 5 ***
// ******************

public class DayOfTheWeekArrStringTest {
    @Test
    void DaysOfTheWeakArrStringTestMonday(){
        DayOfTheWeekDetectorArrStringVersion calendar =
                new DayOfTheWeekDetectorArrStringVersion();

        String expectedValue = "Monday";
        String actualValue = calendar.detectDayName(1);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void DaysOfTheWeakArrStringTestFriday(){
        DayOfTheWeekDetectorArrStringVersion calendar =
                new DayOfTheWeekDetectorArrStringVersion();

        String expectedValue = "Friday";
        String actualValue = calendar.detectDayName(5);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void DaysOfTheWeakArrStringTestSunday(){
        DayOfTheWeekDetectorArrStringVersion calendar =
                new DayOfTheWeekDetectorArrStringVersion();

        String expectedValue = "Sunday";
        String actualValue = calendar.detectDayName(7);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void DaysOfTheWeakArrStringTestNonExistingDay(){
        DayOfTheWeekDetectorArrStringVersion calendar =
                new DayOfTheWeekDetectorArrStringVersion();

        String expectedValue = "Please input a valid number between 1 and 7";
        String actualValue = calendar.detectDayName(234);

        Assertions.assertEquals(expectedValue, actualValue);
    }
}
