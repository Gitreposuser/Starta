import java.util.ArrayList;
import java.util.Collections;

public class SortService {

    public void sortWords(ArrayList<String> words) {
        Collections.sort(words);
    }

    public void  sortNumbers(ArrayList<Integer> numbers) {
        Collections.sort(numbers, Collections.reverseOrder());
    }
}
