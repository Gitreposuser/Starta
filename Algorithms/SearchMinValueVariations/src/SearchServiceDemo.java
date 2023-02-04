public class SearchServiceDemo {
    public static void main(String[] args) {
        // Test array
        int [] arr = new int [] {1, 4, 20, -2, 31, 15, 21, 17, 5};
        SearchService.showArray(arr);

        int minIndex = SearchService.indexOfMinValue(arr);
        System.out.println("min value: " + arr[minIndex]);

        // Before calling method second time
        // Need to change min value to max integer value
        // Warning input array will be modified
        arr[minIndex] = Integer.MAX_VALUE;
        minIndex = SearchService.indexOfMinValue(arr);
        System.out.println("second min value: " + arr[minIndex]);

        // Third min value
        arr[minIndex] = Integer.MAX_VALUE;
        minIndex = SearchService.indexOfMinValue(arr);
        System.out.println("third min value: " + arr[minIndex]);

        // And we can continue.
    }
}
