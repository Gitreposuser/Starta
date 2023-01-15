import java.util.ArrayList;

public class IntegerListDemo {
    private ArrayList<Integer> list;

    public IntegerListDemo() {
        list = new ArrayList<Integer>();
    }

    public void addToHead(int value) {
        list.add(0, value);
    }

    public void addToTail(int value) {
        list.add(value);
    }

    public void removeLast() {
        if(isEmpty()) {
            return;
        }
        list.remove((list.size() - 1));
    }

    public void removeAtPosition(int index) {
        if(isEmpty()){
            return;
        }
        if((0 > index) || (list.size() <= index)) {
            return;
        }
        list.remove(index);
    }

    public boolean isEmpty() {
        if(list.isEmpty())
            return true;
        else {
            return false;
        }
    }

    public int getLenght() {
        return list.size();
    }

    public void showList() {
        System.out.println("*** list data ***");
        for(Integer data: list) {
            System.out.println("element: " + data);
        }
    }

    public void showList2() {
        System.out.println("*** list data ***");
        list.forEach(value -> {
            System.out.println("element: " + value);
        });
    }
}
