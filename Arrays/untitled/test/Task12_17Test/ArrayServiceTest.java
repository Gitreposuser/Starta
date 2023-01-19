package Task12_17Test;

import Task12_17.ArrayService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class ArrayServiceTest {
    private int [] testArray = {1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 7};

    @Test
    void arrayServiceContains() {
        ArrayService test = new ArrayService();

        boolean actualValue = test.containsElement(testArray, 7);
        boolean expectedValue = true;

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void arrayServiceNotContains() {
        ArrayService test = new ArrayService();

        boolean actualValue = test.containsElement(testArray, 9);
        boolean expectedValue = false;

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void arrayServiceCounterOfEntries2() {
        ArrayService test = new ArrayService();

        int actualValue = test.numberOfEntries(testArray, 2);
        int expectedValue = 2;

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void arrayServiceCounterOfEntries3() {
        ArrayService test = new ArrayService();

        int actualValue = test.numberOfEntries(testArray, 7);
        int expectedValue = 3;

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void arrayServiceCounterOfEntries0() {
        ArrayService test = new ArrayService();

        int actualValue = test.numberOfEntries(testArray, 10);
        int expectedValue = 0;

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void arrayServiceReplaceElement1To11() {
        ArrayService test = new ArrayService();

        test.replaceFirstEntryOfElement(testArray, 2, 11);
        int actualValue = testArray[1];
        int expectedValue = 11;

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void arrayServiceReplaceElement5To11() {
        ArrayService test = new ArrayService();

        test.replaceFirstEntryOfElement(testArray, 5, 11);
        int actualValue = testArray[6];
        int expectedValue = 11;

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void arrayServiceReplaceElement15NoChange() {
        ArrayService test = new ArrayService();

        test.replaceFirstEntryOfElement(testArray, 15, 21);
        int [] actualValue = testArray;
        int [] expectedValue = {1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 7};

        Assertions.assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    void arrayServiceReplaceAllEntriesOfElement2To11() {
        ArrayService test = new ArrayService();

        test.replaceAllEntryOfElement(testArray, 2, 11);
        int [] actualValue = testArray;
        int [] expectedValue = {1, 11, 11, 3, 4, 4, 5, 6, 7, 7, 7};

        Assertions.assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    void arrayServiceReplaceAllEntriesOfElement5To17() {
        ArrayService test = new ArrayService();

        test.replaceAllEntryOfElement(testArray, 5, 17);
        int [] actualValue = testArray;
        int [] expectedValue = {1, 2, 2, 3, 4, 4, 17, 6, 7, 7, 7};

        Assertions.assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    void arrayServiceReplaceAllEntriesOfElementNoChange() {
        ArrayService test = new ArrayService();

        test.replaceAllEntryOfElement(testArray, 12, 22);
        int [] actualValue = testArray;
        int [] expectedValue = {1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 7};

        Assertions.assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    void arrayServiceRevertArray() {
        ArrayService test = new ArrayService();

        test.revertArray(testArray);
        int [] actualValue = testArray;
        int [] expectedValue = {7, 7, 7, 6, 5, 4, 4, 3, 2, 2, 1};

        Assertions.assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    void arrayServiceRevertArrayEven() {
        ArrayService test = new ArrayService();

        int [] testArray = new int[] {1, 2, 3, 4, 5, 6};
        test.revertArray(testArray);
        int [] actualValue = testArray;
        int [] expectedValue = {6, 5, 4, 3, 2, 1};

        Assertions.assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    void arrayServiceSortArray() {
        ArrayService test = new ArrayService();

        int [] testArray = new int[] {5, 2, 4, 7, 1, 6};
        test.sortArray(testArray);
        int [] actualValue = testArray;
        int [] expectedValue = {1, 2, 4, 5, 6, 7};

        Assertions.assertArrayEquals(expectedValue, actualValue);
    }
    @Test
    void arrayServiceSortArrayOdd() {
        ArrayService test = new ArrayService();

        int [] testArray = new int[] {5, 2, 4, 7, 1, 6, 3};
        test.sortArray(testArray);
        int [] actualValue = testArray;
        int [] expectedValue = {1, 2, 3, 4, 5, 6, 7};

        Assertions.assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    void arrayServiceSortArrayAlreadySorted() {
        ArrayService test = new ArrayService();

        int [] testArray = new int[] {1, 2, 4, 5, 6, 7};
        test.sortArray(testArray);
        int [] actualValue = testArray;
        int [] expectedValue = {1, 2, 4, 5, 6, 7};

        Assertions.assertArrayEquals(expectedValue, actualValue);
    }
}
