package Task19;

import Task18.WhileInfiniteLoop;

public class WhileInfiniteLoopBreak {
    public void infiniteWhileLoopBreak() {
        while(true) {
            break;
        }
    }

    public static void main(String [] args) {
        WhileInfiniteLoopBreak loop = new WhileInfiniteLoopBreak();
        loop.infiniteWhileLoopBreak();
    }
}
