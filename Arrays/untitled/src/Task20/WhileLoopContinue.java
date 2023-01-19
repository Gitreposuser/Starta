package Task20;

public class WhileLoopContinue {
    public void loopWhileContinue() {
        System.out.println("Cycle while starts.");
        int counter = 0;
        while(counter < 10) {
            if(10 > counter) {
                counter++;
                continue;
            }
            System.out.println("cant see this message");
            System.out.println("same as counter: " + counter);
        }
        System.out.println("Cycle while ends.");
        System.out.println("counter: " + counter);
    }

    public static void main(String [] args) {
        WhileLoopContinue loop = new WhileLoopContinue();
        loop.loopWhileContinue();
    }
}
