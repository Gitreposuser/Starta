package Task18;

public class WhileInfiniteLoop {
    public void infiniteWhileLoop() {
        while(true) {
            // working in progress indicator
            System.out.print("|");
            System.out.print("\b");
            System.out.print("/");
            System.out.print("\b");
            System.out.print("-");
            System.out.print("\b");
            System.out.print("\\");
            System.out.print("\b");
        }
    }

    public static void main(String [] args) {
        WhileInfiniteLoop loop = new WhileInfiniteLoop();
        loop.infiniteWhileLoop();
    }
}
