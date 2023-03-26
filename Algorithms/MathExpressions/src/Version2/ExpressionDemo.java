package Version2;

public class ExpressionDemo {
    public static void main(String[] args) {
        ExpressionService expService = new ExpressionService();
        String expression = expService.getExpressionFromUI();
        System.out.println(expression);
    }
}