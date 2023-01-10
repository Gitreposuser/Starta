import java.util.ArrayList;

public class ArrayListTest {
    public void insertionTest(ArrayList<String> textList) {
        final int maxValue = 10000;

        for (int counter = 0; counter < maxValue; counter++) {
            textList.add("abc");
        }
    }

    public void extractionTest(ArrayList<String> textList) {
        final int maxValue = 10000;

        for (int counter = 0; counter < maxValue; counter++) {
            textList.remove("abc");
        }
    }
}
