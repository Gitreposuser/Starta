public class SquareEquation {
    private int param1;
    private int param2;
    private int param3;

    public SquareEquation(int param1, int param2, int param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    public Roots solution() {
        float d = param2 * param2 - 4 * param1 * param3;
        if(d < 0) {
            throw new ArithmeticException("There is no roots for equation");
        }
        float x1 = 0;
        float x2 = 0;
        if(d == 0) {
            x1 = (float)((-1 * param2 + Math.sqrt(d))/(2 * param1));
            x2 = x1;
        }
        if(d > 0) {
            x1 = (float)((-1 * param2 + Math.sqrt(d))/(2 * param1));
            x2 = (float)((-1 * param2 - Math.sqrt(d))/(2 * param1));
        }
        Roots roots = new Roots(x1, x2);
        return roots;
    }
}