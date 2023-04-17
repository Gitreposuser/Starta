public class MathService{
    public static void toSquare(int x) {
        System.out.println(" x = " + x);
        System.out.println(" x * x = " + x * x);
    }

    public static void threeMultiplyXPlusFive(int x) {
        System.out.println(" x = " + x);
        System.out.println(" 3 * x + 5 = " + 3 * x + 5);
    }

    public static void oneDivideByX(int x) {
        System.out.println(" x = " + x);
        if(x == 0) {
            System.out.println(" Can't divide by zero!");
        }
        System.out.println(" 1 / x = " + 1 / x);
    }

    public static void toCube(int x) {
        System.out.println(" x = " + x);
        System.out.println(" x * x * x = " + x * x * x);
    }

    public static void toAbs(int x) {
        System.out.println(" x = " + x);
        if(x < 0) {
            System.out.println(" |x| = " + x * (-1));
        } else {
            System.out.println(" |x| = " + x);
        }
    }
}