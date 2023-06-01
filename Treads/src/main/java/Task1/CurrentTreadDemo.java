package Task1;

public class CurrentTreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        String tName = thread.getName();
        int tPriority = thread.getPriority();
        boolean tIsAlive = thread.isAlive();
        boolean tIsInterrupted = thread.isInterrupted();
        System.out.println(" Current thread:");
        System.out.println(" name: " + tName);
        System.out.println(" priority: " + tPriority);
        System.out.println(" is alive: " + tIsAlive);
        System.out.println(" is interrupted: " + tIsInterrupted);
    }
}
