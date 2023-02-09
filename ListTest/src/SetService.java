import java.util.HashSet;
import java.util.Set;

public class SetService {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionResult = new HashSet<>(set1);
        unionResult.addAll(set2);
        return unionResult;
    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectResult = new HashSet<>(set1);
        intersectResult.retainAll(set2);
        return intersectResult;
    }
}
