import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        // Dictionary base values
        dictionary.put("plane", "sambik");
        dictionary.put("train", "chy-chy");
        dictionary.put("car", "bibika");

        while(true) {
            System.out.println("Enter word to translate or \"exit\" to quit");
            String userInput = getDataFromUI();
            if(userInput.equals("exit")) {
                break;
            }
            if(dictionary.containsKey(userInput)) {
                // Get from the dictionary
                System.out.println(dictionary.get(userInput));
            } else {
                // Add to dictionary
                System.out.println("There is no such word in dictionary");
                System.out.println("Type meaning below to add");
                String meaningInput = getDataFromUI();
                dictionary.put(userInput, meaningInput);
            }
        }
    }

    public static String getDataFromUI() {
        Scanner ui = new Scanner(System.in);  // Create a Scanner object
        String word = ui.nextLine();  // Read user input
        return word;
    }
}
