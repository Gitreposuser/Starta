import java.util.Scanner;

public class UI {
    public static int getNumberOfPlayers() {
        int result = 0;
        System.out.println(" Enter number of players:");

        try {
            Scanner in = new Scanner(System.in);
            result = in.nextInt();
        }
        catch (Exception ex) {
            System.out.println("Try input number");
            getNumberOfPlayers();
        }
        return result;
    }
}
