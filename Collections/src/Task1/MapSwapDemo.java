package Task1;

import java.util.HashMap;
import java.util.Map;

public class MapSwapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "aaa");
        map.put(2, "bbb");
        map.put(3, "ccc");
        map.put(4, "aaa");
        System.out.println(map);
        System.out.println(MapService.swapMap(map));
    }
}
