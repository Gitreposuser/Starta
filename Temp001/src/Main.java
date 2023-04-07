import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Stream.of(List.of("Jim", "Jillian", "Jacob"),
                List.of("Franco", "Forest"), List.of("Bill"))
                .flatMap(Collection::stream)
                .toList();
        for(String t: names) {
            System.out.println(t);
        }
    }
}