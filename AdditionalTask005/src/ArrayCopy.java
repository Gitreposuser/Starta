import java.util.ArrayList;
import java.util.List;
public class ArrayCopy {
    public int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        if (isIndexRangeInvalid(in, numberFrom, numberTo)) {
            return new int[0];
        }

        List<Integer> foundItems = new ArrayList<>();

        for (int currentIndex = 0; currentIndex < in.length; currentIndex++) {
            if ((in[currentIndex] >= numberFrom) &&
                    (in[currentIndex] <= numberTo)) {
                foundItems.add(in[currentIndex]);
            }
        }

        int[] result = new int[foundItems.size()];
        int counter = 0;

        for (int number : foundItems) {
            result[counter] = number;
            counter++;
        }
        return result;
    }

    private boolean isIndexRangeInvalid(int[] in, int numberFrom,
                                        int numberTo) {
        if (1 > in.length) {
            return true;
        }
        if (numberFrom > numberTo) {
            return true;
        }
        return false;
    }
}
