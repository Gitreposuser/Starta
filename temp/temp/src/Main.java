import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static java.lang.System.*;
import static java.util.spi.ToolProvider.findFirst;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"a1", "a2", "a3", "abc1", "cba", "ff"};
        Stream<String> str = Arrays.stream(arr);
        /*
        str.findFirst().ifPresentOrElse(System.out::println,
                () -> out.println("xxx"));

         */
        str.filter(x -> x.contains("f") || x.contains("2"))
                .map(x -> x += "_x").forEach(out::println);
    }
}