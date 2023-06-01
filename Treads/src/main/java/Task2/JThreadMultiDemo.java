package Task2;

public class JThreadMultiDemo {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        for (int i = 1; i < 8; i++) {
            new JThread("JThread " + i).start();
        }
        System.out.println("Main thread finished...");
    }
}