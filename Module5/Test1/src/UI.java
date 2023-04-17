import java.util.Scanner;

public class UI {
    public static String getEmail() {
        System.out.println("Please enter e-mail.");
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        return result;
    }
}
