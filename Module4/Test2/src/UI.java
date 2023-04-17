import java.util.Scanner;

public class UI {
    public static String getUserData() {
        String result;
        Scanner sc = new Scanner(System.in);
        result = sc.nextLine();
        return result;
    }
}