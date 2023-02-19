package Task2;

// **************
// *** Task 2 ***
// **************

import java.util.Arrays;
import java.util.Random;

public class StreamApiService {
    public static int [] generateRandomNumbers(int length, int from, int to) {
        Random rnd = new Random();
        int [] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = rnd.nextInt(to - from) + from;
        }
        return result;
    }

    public static int countSumOfOddNumbers(int [] array) {
        return Arrays.stream(array)
                .filter(x -> x % 2 == 0)
                .sum();
    }
}