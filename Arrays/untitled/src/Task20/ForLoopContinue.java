package Task20;

public class ForLoopContinue {
    public void loopForContinue() {
        System.out.println("Cycle for starts.");
        int counter = 0;
        for(; counter < 10; counter++) {
            if(10 > counter) {
                continue;
            }
            System.out.println("cant see this message");
            System.out.println("same as counter: " + counter);
        }
        System.out.println("Cycle for ends.");
        System.out.println("counter: " + counter);
    }

    public static void main(String [] args) {
        ForLoopContinue loop = new ForLoopContinue();
        loop.loopForContinue();
    }
}
