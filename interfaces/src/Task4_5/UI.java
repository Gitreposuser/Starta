package Task4_5;
import java.util.Scanner;

// ******************
// *** Task 4 - 5 ***
// ******************

public class UI {

    public static int getNumber() {
        int result = 0;
        System.out.println("Input number of day? ");
        try {
            Scanner in = new Scanner(System.in);
            result = in.nextInt();
        }
            catch (Exception ex) {
            System.out.println("Ooops Something whent wrong...");
        }
        return result;
    }
}
