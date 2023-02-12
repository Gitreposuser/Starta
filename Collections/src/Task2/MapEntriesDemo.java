package Task2;

import Task1.MapService;

public class MapEntriesDemo {
    public static void main(String[] args) {
        Integer [] array = new Integer[] { 1, 3, 1, 3, 3, 5, 5, 7, 7, 5, 7, 5 };
        showArray(array);
        System.out.println(MapService.numberOfEntries(array));

        // Same for double
        // Demonstrates independence of types
        Double [] arrayD = new Double[] {1.24, 1.24, 3.1, 3.1, 5.8};
        showArray(arrayD);
        System.out.println(MapService.numberOfEntries(arrayD));
    }

    private static <K> void showArray(K [] array) {
        System.out.println("Array: ");
        for(K element: array) {
            System.out.print(element + ", ");
        }
        System.out.println("");
    }
}
