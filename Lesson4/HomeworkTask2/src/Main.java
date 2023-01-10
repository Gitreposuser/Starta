import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayListTest test = new ArrayListTest();
        ArrayList<String> dataList = new ArrayList<String>();

        long start = System.nanoTime();
        test.insertionTest(dataList);
        long end = System.nanoTime();
        System.out.println("Insertion time");
        System.out.println("    in nano seconds: " + (end - start));

        start = end = 0;

        start = System.nanoTime();
        test.extractionTest(dataList);
        end = System.nanoTime();
        System.out.println("Extraction time");
        System.out.println("    in nano seconds: " + (end - start));
    }
}