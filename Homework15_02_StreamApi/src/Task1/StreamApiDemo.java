package Task1;

import java.util.LinkedList;
import java.util.List;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<String> lines = new LinkedList<>();
        lines.add("aslkkjfh");
        lines.add("ashfkjhw");
        lines.add("alkshfweyio");
        int res = StreamApiService.countOfUniqueLetters(lines);
        System.out.println("res: " + res);
    }
}
