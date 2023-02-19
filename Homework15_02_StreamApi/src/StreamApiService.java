import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamApiService {
    public static void showStringsAsOne(ArrayList<String> str) {
        String result = "";
        for(String text: str) {
            result = result + text;
        }
        System.out.println("Input strings: ");
        System.out.println(result);
    }

    public static int countDifferentLettersNaive(ArrayList<String> arrStr) {
        String buffer = "";
        for(String text: arrStr) {
            buffer += text;
        }

        int counter = 0;
        boolean isUnique = true;
        for(int outer = 0; outer < buffer.length(); outer++){
            char symbolA = buffer.charAt(outer);
            for(int index = outer + 1; index < buffer.length(); index++) {
                char symbolB = buffer.charAt(index);
                if(symbolA == symbolB) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique) {
                ++counter;
            }
            isUnique = true;
        }
        return counter;
    }
    public static long countDifferentLetters(ArrayList<String> arrStr) {
        long uniqueLetterCount = arrStr.stream()
                .filter(s -> s.length() > 0)
                .count();
        return uniqueLetterCount;
    }
}
