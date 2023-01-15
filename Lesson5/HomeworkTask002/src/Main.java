import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(10);
        for(Integer data: list) {
            System.out.println("data: " + data);
        }
    }
}