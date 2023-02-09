import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        fillSet(set1, 0, 10);
        fillSet(set2, 5, 10);

        System.out.println("Set 1 and 2");
        System.out.println(set1);
        System.out.println(set2);

        System.out.println("Union");
        System.out.println(SetService.union(set1, set2));
        System.out.println("Intersection");
        System.out.println(SetService.intersect(set1, set2));
    }

    public static void fillSet(Set<Integer> set, int from, int to) {
        for(int i = from; i < to; i++) {
            set.add(i);
        }
    }
}
