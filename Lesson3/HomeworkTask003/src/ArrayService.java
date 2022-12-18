import java.util.Random;

public class ArrayService {
    public static int[] generateArray() {
        Random rnd = new Random();

        int [] result = new int[(rnd.nextInt(5) + 5)];

        for(int i = 0; i < result.length; i++) {
            result[i] = rnd.nextInt(10);
        }

        return result;
    }

    public static long calculateSumOfOddNumbers(int [] array) {
        long result = 0;
        for(int i = 0; i < array.length; i++) {
            if(0 == (i % 2)) {
                result += array[i];
            }
        }
        return result;
    }

    public static void showArray(int[] array){
        for(int number: array) {
            System.out.println(number);
        }
    }
}