import java.time.LocalTime;
import java.util.Scanner;

public class UI {
    public static LocalTime getTime() {
        // Get hour and validate data
        int hour = 0;
        do {
            hour = UI.getHour();
        } while (!UI.hourValidator(hour));

        // Get minutes and validate
        int minutes = 0;
        do {
            minutes = UI.getMinutes();
        } while (!UI.minutesValidator(minutes));

        LocalTime time = LocalTime.of(hour, minutes);
        return time;
    }

    private static int getHour() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour between 9 and 18: ");
        return sc.nextInt();
    }

    private static int getMinutes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter minutes 00 or 30: ");
        return sc.nextInt();
    }

    private static boolean hourValidator(int hour) {
        if(hour < 9 || hour > 18) {
            System.out.println("Hour time is not valid, try again");
            return false;
        }
        return true;
    }

    private static boolean minutesValidator(int minute) {
        if(minute == 0 || minute == 30) {
            return true;
        }
        System.out.println("Minutes is not valid");
        System.out.println("Choose between 00 or 30");
        return false;
    }

    public static String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String result = sc.nextLine();
        return result;
    }
}