package Task18;

public class ForInfiniteLoop {
    public void infiniteForLoop() {
        for(; true;) {
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
        ForInfiniteLoop loop = new ForInfiniteLoop();
        loop.infiniteForLoop();
    }
}
