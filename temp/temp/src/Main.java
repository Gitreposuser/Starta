import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(-3);
        list.add(15);
        list.add(Integer.MAX_VALUE);

        for(int num: list){
            if(num % 2 != 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }

    }
}