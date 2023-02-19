package Task4_5;

// ******************
// *** Task 4 - 5 ***
// ******************

public class DayOfTheWeekDetectorDemo {
    private DayOfTheWeekDetector detectorType;
    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detectorType) {
        this.detectorType = detectorType;
    }

    void run() {
        int day = UI.getNumber();
        System.out.println("Method type is: " + this.detectorType.toString());
        System.out.println("Day #: " + day + " is "
                + this.detectorType.detectDayName(day));
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo demoIf =
                new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        demoIf.run();

        DayOfTheWeekDetectorDemo demoSwitch =
                new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        demoSwitch.run();

        DayOfTheWeekDetectorDemo demoArrString =
                new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrStringVersion());
        demoArrString.run();
    }
}
