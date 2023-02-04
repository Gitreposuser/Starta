public class SearchService {
    public static int indexOfMinValue(int [] arr) {
        int minValue = arr[0];
        int minIndex = 0;

        for(int i = 0; i < arr.length; i++) {
            if(minValue > arr[i]) {
                minValue = arr[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void showArray(int [] arr) {
        System.out.println("input array");
        for(int num: arr) {
            System.out.print(num + ", ");
        }
        System.out.println("");
    }
}
