package AdditionalTasks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiDemo {
    public static void main(String[] args) throws Exception {
        // Return count of entries object "a1"
        String text = "acv a1 bh3 jg tn6 klc9 a1 bd a1";
        int res = StreamApiService.countOfEntries(text, "a1");
        System.out.println("Count of entries \"a1\" is: " + res);

        // Return first element of collection
        // Or "O", if collection is empty
        LinkedList<String> names = new LinkedList<>();
        names.add("John");
        names.add("Sam");
        names.add("Tom");
        // Uncomment to get "O"
        //names = null;
        try {

            Optional<String> result = names.stream()
                    .findFirst();
            System.out.println("\nFirst element of collection is: "
                    + result.get());
        } catch(Exception e) {
            System.out.println("O");
        }

        // Return last element of collection
        // Or "empty", when collection is empty
        // Uncomment to get "empty"
        //names = null;
        try {
            long count = names.stream().count();
            String result2 = names.stream()
                    .skip(count - 1)
                    .findFirst()
                    .get();
            System.out.println("\nLast element of collection is: "
                    + result2);
        } catch (Exception e) {
            System.out.println("empty");
        }

        // Find element "a3" in collection
        // Or through exception
        LinkedList<String> lines = new LinkedList<>();
        lines.add("a1");
        lines.add("a2");
        lines.add("a3");
        lines.add("a4");
        lines.add("a5");
        lines.add("a6");

        try {
            String result3 = lines.stream()
                    .filter(l -> l == "a3")
                    .collect(Collectors.joining());
            System.out.println("\nFound element: " + result3);
        } catch (Exception e) {
            throw new Exception("Throughout new exception");
        }

        // Return by order 3-rd element
        String result4 = lines.stream()
                .skip(2)
                .limit(1)
                .collect(Collectors.joining());
        System.out.println("\n3-rd element is: " + result4);

        // Return two elements from 2nd
        System.out.println("\nTwo elements from 2nd ");
                lines.stream()
                .skip(2)
                .limit(2)
                .forEach(el -> System.out.println("element: " + el));

        // Return collection with unique elements only
        // From unsorted stream
        ArrayList<String> array = new ArrayList<>();
        array.add("John");
        array.add("Tom");
        array.add("John");
        array.add("Nikki");
        System.out.println("\nCollection with unique elements");
        System.out.println("unsorted list:");
        array.stream()
                .distinct()
                .forEach(System.out::println);

        // Return collection with unique elements only
        // From sorted stream
        System.out.println("\nCollection with unique elements");
        System.out.println("sorted list:");
        array.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        // Find if exist element "a1" in collection
        System.out.println("\nFind \"a1\": ");
        lines.stream()
                .filter(x -> x == "a1")
                .forEach(System.out::println);

        // Add "_1" to each element in collection
        System.out.println("\nAdd \"_1\" to each element:");
        lines.stream()
                .forEach(e -> {
                    System.out.println(e + "_1");
                });
    }
}