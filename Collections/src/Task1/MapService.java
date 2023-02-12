package Task1;

import java.util.*;

public class MapService {
    public static <V, K> Map<V, LinkedList<K>> swapMap(Map<K, V> map) {
        Map<V, LinkedList<K>> reversedMap = new HashMap<>();
        Iterator iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<K, V> element =
                    (Map.Entry<K, V>)iterator.next();
            if(reversedMap.containsKey(element.getValue())) {
                LinkedList<K> tempData = reversedMap.get(element.getValue());
                tempData.add(element.getKey());
                reversedMap.put(element.getValue(), tempData);
            } else {
                LinkedList<K> duplicates = new LinkedList<>();
                duplicates.add(element.getKey());
                reversedMap.put(element.getValue(), duplicates);
            }
        }
        return reversedMap;
    }

    public static <K, V> Map<K, V> numberOfEntries(V [] array) {
        Map<K, V> entriesMap = new HashMap<>();

        for(V element: array) {
            Integer counter = (Integer) entriesMap.get(element);
            if(null == counter) {
                counter = 0;
            }
            entriesMap.put((K) element, (V)(++counter));
        }
        return entriesMap;
    }
}