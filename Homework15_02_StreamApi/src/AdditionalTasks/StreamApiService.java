package AdditionalTasks;

import java.util.Arrays;

public class StreamApiService {
    public static int countOfEntries(String inputText, String countedText) {
        int result = (int)Arrays.stream(inputText.split(" "))
                .filter(o -> o.contains(countedText))
                .count();
        return result;
    }
}
