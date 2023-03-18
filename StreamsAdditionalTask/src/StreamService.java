import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StreamService {
    public int countDifferentWords(String text) {
        Pattern pattern = Pattern.compile("[a-zA-Z][^\s]");
        Matcher matcher = pattern.matcher(text);
        List<String> words = new LinkedList<>();
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return (int) words.stream()
                .distinct()
                .count();
    }

    public int countDifferentWordsSplit(String text) {
        Pattern pattern = Pattern.compile("\s+");   // "+" - 1 or more symbol
        Matcher matcher = pattern.matcher(text);
        matcher.find();
        text = matcher.replaceAll(" ");
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));
        return (int) Arrays.stream(words)
                .distinct()
                .count();
    }

    public LinkedList<Integer[]> findPairOfElementsSumNaive(LinkedList<Integer> list,
                                                       int sum){
        LinkedList<Integer[]> result = new LinkedList<>();
        if(list.size() < 1) {
            // throw new Exception("Empty collection");
            return result;
        }

        for (int num: list) {
            for (int index = 1; index < list.size(); index++) {
                if((num + list.get(index)) == sum) {
                    System.out.println("elements: " + num + ", " + list.get(index));
                    Integer [] el = new Integer[2];
                    el[0] = num;
                    el[1] = list.get(index);
                    result.add(el);
                }
            }
        }
        return result;
    }

    public LinkedList<Integer[]> findPairOfElementsSum(LinkedList<Integer> list,
                                                       int sum){
        LinkedList<Integer[]> result = new LinkedList<>();
        if(list.size() < 1) {
            // throw new Exception("Empty collection");
            return result;
        }

        result = list.stream()
                .flatMap(x -> list.stream()
                .filter(y -> y + x == sum)
                .distinct()
                .map(y -> new Integer[]{x, y}))
                .collect(LinkedList::new, LinkedList::add, LinkedList::addAll);
        return result;
    }
}
