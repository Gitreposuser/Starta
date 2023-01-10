import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    public static ArrayList<String> getWords() {
        String buffer = "";
        ArrayList<String> result = new ArrayList<String>();
        System.out.println(" Enter words:");

        try {
            Scanner in = new Scanner(System.in);
            buffer = in.nextLine();
        }
        catch (Exception ex) {
            System.out.println("Ooops Something whent wrong...");
        }

        result = parsString(buffer);
        return result;
    }

    private static ArrayList<String> parsString(String words) {
        ArrayList<String> result = new ArrayList<String>();
        String [] array = words.split(" ");

        for(String text : array) {
            result.add(text);
        }
        return result;
    }

    public static ArrayList<Integer> getNumbers() {
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println(" Enter numbers:");

        try {
            Scanner in = new Scanner(System.in);

            while (in.hasNextInt()) {
                result.add(in.nextInt());
            }
        }
        catch (Exception ex) {
            System.out.println("Ooops Something whent wrong...");
            return  null;
        }

        return result;
    }
}