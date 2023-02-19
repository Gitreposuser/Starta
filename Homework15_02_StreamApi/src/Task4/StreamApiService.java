package Task4;

import java.util.Arrays;

// **************
// *** Task 4 ***
// **************

public class StreamApiService {
    public static void sortStrings(String [] array) {
        Arrays.stream(array)
                .sorted()
                .forEach(System.out::println);
    }
}
