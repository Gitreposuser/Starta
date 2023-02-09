public class Timer {
    private static long startTime;
    private static long endTime;

    public static void startTimer() {
        startTime = System.currentTimeMillis();
    }

    public static void stopTimer() {
        endTime = System.currentTimeMillis();
    }

    public static long getTime() {
        return endTime - startTime;
    }

    public static void showTime(String text) {
        System.out.println(text
                + " "
                + Timer.getTime()
                + " ms");
    }
}
