import java.util.ArrayList;
import java.util.Collections;

public class StreamApiDemo {
    public static void main(String[] args) {
        ArrayList<String> arrStr = new ArrayList<>();
        Collections.addAll(arrStr, "a", "a", "b", "c", "q", "f", "a");
        StreamApiService.showStringsAsOne(arrStr);
        //int count = StreamApiService.countDifferentLettersNaive(arrStr);
        long count = StreamApiService.countDifferentLetters(arrStr);
        System.out.println("counter = " + count);
    }
}
