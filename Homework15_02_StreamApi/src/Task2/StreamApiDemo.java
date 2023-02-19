package Task2;

public class StreamApiDemo {
    public static void main(String[] args) {
        int [] array = StreamApiService.generateRandomNumbers(10,
                1, 10);
        int sum = StreamApiService.countSumOfOddNumbers(array);

        showArray(array);

        System.out.println("Sum of odd elements in array: " + sum);
    }

    public static void showArray(int [] array) {
        int counter = 0;
        for(int num: array) {
            System.out.println("[" + counter + "] = " + num);
            counter++;
        }
    }
}