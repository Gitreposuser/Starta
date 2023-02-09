import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Task 1 - 2
        // Filling list
        // Saving element to var temp
        int listSize = 10_000_000;
        int temp = 0;

        Timer.startTimer();
        for(int index = 0; index < listSize; index++) {
            list.add(index);
            temp = index;
        }
        Timer.stopTimer();
        Timer.showTime("Filling list");

        // Task 3
        // looping list through for each
        Timer.startTimer();
        for(Integer num: list) {

        }
        Timer.stopTimer();
        Timer.showTime("Iterate for each");

        // Task 4
        // Call list size for every iteration
        Timer.startTimer();
        for(int index = 0; index < listSize; index++) {
            list.size();
        }
        Timer.stopTimer();
        Timer.showTime("iterate for + get size");

        // Task 5
        // Saving list size for every iteration
        Timer.startTimer();
        for(int index = 0; index < listSize; index++) {
            temp = list.size();
        }
        Timer.stopTimer();
        Timer.showTime("iterate for + get size to variable");

        // Task 6
        // Reverse list iterator
        Timer.startTimer();
        for(int index = listSize; index > 0; index--) {
            temp = list.size();
        }
        Timer.stopTimer();
        Timer.showTime("iterate for backwards + saving size to var");

        // Task 7
        // Using iterator
        Timer.startTimer();
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.next();
            temp = list.size();
        }
        Timer.stopTimer();
        Timer.showTime("iterate through iterator + saving size to var");

        // Task 8
        // Using list iterator
        Timer.startTimer();
        ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            listIterator.next();
            temp = list.size();
        }
        Timer.stopTimer();
        Timer.showTime("iterate through listIterator + saving size to var");
    }
}
