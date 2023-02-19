package Task3;

import java.util.Arrays;
import java.util.regex.Pattern;

// **************
// *** Task 3 ***
// **************

public class StreamApiService {
    public static void showNamesByFilter(String [] names, String filter) {
        Pattern pattern = Pattern.compile(filter);
        Arrays.stream(names)
                .filter(pattern.asPredicate())
                .forEach(System.out::println);
    }
}