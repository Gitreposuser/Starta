package Task7_11;

public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();

        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfTheWeek);
    }
}
