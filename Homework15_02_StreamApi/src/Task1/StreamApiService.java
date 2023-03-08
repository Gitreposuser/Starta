package Task1;

import java.util.List;
import static java.util.stream.Collectors.*;

public class StreamApiService {
    public static int countOfUniqueLetters(List<String> lines) {
        int result = 0;

        lines.stream()
                .map(x -> x + "")
                .forEach(System.out::println);

        return result;
    }
}
