package Task4_5;

// ******************
// *** Task 4 - 5 ***
// ******************

public class DayOfTheWeekDetectorArrStringVersion implements DayOfTheWeekDetector{
    @Override
    public String detectDayName(int number) {
        String [] days = { " ",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"};

        String defaultDay = "Please input a valid number between 1 and 7";

        if(number > 0 && number < 8) {
            return days[number];
        } else {
            return defaultDay;
        }
    }
}
