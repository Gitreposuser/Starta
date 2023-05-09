package Version2;

public class ExpressionDemo {
    public static void main(String[] args) {
        System.out.println("Input math expression to calculate");
        String expression = UI.getMathExpression();
        ExpressionService exp = new ExpressionService(expression);
        exp.compileExpression();
        exp.executeExpression();
        exp.showResult();
    }
}