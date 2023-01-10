import java.util.Random;

public class ArrayService {
    public static int [] createArray() {
        Random rnd = new Random();
        int [] array = new int[rnd.nextInt(50)];
        return array;
    }

    public static void initArray(int [] array) {
        Random rnd = new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }
    }

    public static void showArray(int [] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("element[" + i + "] = " + array[i] + ", ");
        }
    }

    public static void increaseArrayByTwo(int [] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] += 2;
        }
    }
}
