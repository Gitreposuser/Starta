package Version2;

public class ExpressionDemo {
    public static void main(String[] args) {
        String expression = UI.getMathExpression();
        System.out.println(expression);
        ExpressionService exp = new ExpressionService(expression);
        exp.compileExpression();
    }
}