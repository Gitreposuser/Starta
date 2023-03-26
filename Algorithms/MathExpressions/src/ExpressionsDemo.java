import java.io.IOException;

public class ExpressionsDemo {
    public static void main(String[] args) throws IOException {
        ExpressionService expression = new ExpressionService();
        String exp = "15 + 7 * (3 * 2)";
        String content = expression.fileBuilder(exp);
        expression.fileWriter(content);
        expression.compileFile();
    }
}
