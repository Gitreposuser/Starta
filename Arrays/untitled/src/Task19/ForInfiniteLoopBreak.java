package Task19;

import Task18.ForInfiniteLoop;

public class ForInfiniteLoopBreak {
    public void infiniteForLoopBreak() {
        for(; true;) {
            break;
        }
    }

    public static void main(String [] args) {
        ForInfiniteLoopBreak loop = new ForInfiniteLoopBreak();
        loop.infiniteForLoopBreak();
    }
}
