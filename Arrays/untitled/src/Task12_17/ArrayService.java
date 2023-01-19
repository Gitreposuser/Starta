package Task12_17;

public class ArrayService {
    public boolean containsElement(int [] array, final int element) {
        for(int num: array) {
            if(element == num) {
                return true;
            }
        }
        return false;
    }

    public int numberOfEntries(int [] array, final int element) {
        int counterOfEntries = 0;
        for(int num: array) {
            if(element == num) {
                counterOfEntries++;
            }
        }
        return counterOfEntries;
    }

    public void replaceFirstEntryOfElement(int [] array, final int element, final int replaceNum) {
        for(int index = 0; index < array.length; index++) {
            if(element == array[index]) {
                array[index] = replaceNum;
                return;
            }
        }
    }

    public void replaceAllEntryOfElement(int [] array, final int element, final int replaceNum) {
        for(int index = 0; index < array.length; index++) {
            if(element == array[index]) {
                array[index] = replaceNum;
            }
        }
    }

    public void revertArray(int [] array) {
        int headIndex = 0;
        int tailIndex = array.length - 1;
        int buffer;
        while(headIndex < tailIndex) {
            buffer = array[headIndex];
            array[headIndex] = array[tailIndex];
            array[tailIndex] = buffer;
            headIndex++;
            tailIndex--;
        }
    }

    public void sortArray(int [] array) {
        boolean inProgress = true;
        int buffer;
        while(inProgress) {
            inProgress = false;
            for(int index = 0; index < (array.length - 1); index++) {
                if(array[index] > array[index + 1]) {
                    buffer = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = buffer;
                    inProgress = true;
                }
            }
        }
    }
}
