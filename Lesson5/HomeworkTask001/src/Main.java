public class Main {
    public static void main(String[] args) {
        IntegerListDemo demo = new IntegerListDemo();
        demo.addToTail(5);
        demo.addToHead(7);
        demo.addToTail(3);
        demo.addToTail(1);
        demo.showList();
        // demo.showList2();
        System.out.println("list lenght: " + demo.getLenght());
        System.out.println("list is empty: " + demo.isEmpty());
        System.out.println("removing last");
        demo.removeLast();
        demo.showList();
        System.out.println("removing at [0]");
        demo.removeAtPosition(0);
        demo.showList();
    }
}