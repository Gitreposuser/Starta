package Task7_11Test;

import Task7_11.DayOfTheWeekDetector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class DayOfTheWeekDetectorTest {
    @Test
    void findDayOfTheWeakMonday() {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();

        String actualValue = test.findDayOfTheWeek(1);
        String expectedValue = "Monday";

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void findDayOfTheWeakTuesday() {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();

        String actualValue = test.findDayOfTheWeek(2);
        String expectedValue = "Tuesday";

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void findDayOfTheWeakWednesday() {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();

        String actualValue = test.findDayOfTheWeek(3);
        String expectedValue = "Wednesday";

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void findDayOfTheWeakThursday() {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();

        String actualValue = test.findDayOfTheWeek(4);
        String expectedValue = "Thursday";

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void findDayOfTheWeakFriday() {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();

        String actualValue = test.findDayOfTheWeek(5);
        String expectedValue = "Friday";

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void findDayOfTheWeakSaturday() {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();

        String actualValue = test.findDayOfTheWeek(6);
        String expectedValue = "Saturday";

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void findDayOfTheWeakSunday() {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();

        String actualValue = test.findDayOfTheWeek(7);
        String expectedValue = "Sunday";

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void findDayOfTheWeakWrongData() {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();

        String actualValue = test.findDayOfTheWeek(32);
        String expectedValue = "Not correct day number";

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void findDayOfTheWeakWrongData2() {
        DayOfTheWeekDetector test = new DayOfTheWeekDetector();

        String actualValue = test.findDayOfTheWeek(-15);
        String expectedValue = "Not correct day number";

        Assertions.assertEquals(expectedValue, actualValue);
    }
}
