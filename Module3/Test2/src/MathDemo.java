public class MathDemo {
    public static void main(String[] args) {
        test(() -> MathService.toSquare(-8));
        test(() -> MathService.threeMultiplyXPlusFive(-5));
        test(() -> MathService.oneDivideByX(-4));
        test(() -> MathService.toCube(-3));
        test(() -> MathService.toAbs(-10));
    }

    private static void test(Runnable r) {
        r.run();
    }
}