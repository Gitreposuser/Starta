package Task2;

public class JThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        new JThread("JThread").start();
        System.out.println("Main thread finished...");
    }
}
