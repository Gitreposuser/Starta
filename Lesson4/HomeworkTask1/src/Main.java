import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> wordsList = UI.getWords();
        for (String word : wordsList) {
            System.out.println(word);
        }

        ArrayList<Integer> numsList = UI.getNumbers();
        for (Integer num : numsList)
            System.out.println(num);

        SortService sortService = new SortService();
        sortService.sortWords(wordsList);
        sortService.sortNumbers(numsList);

        System.out.println(" Sorted words list: ");
        for (String word : wordsList) {
            System.out.println("    " + word);
        }

        System.out.println(" Sorted numbers list: ");
        for (Integer num : numsList) {
            System.out.println("   " + num);
        }
    }
}