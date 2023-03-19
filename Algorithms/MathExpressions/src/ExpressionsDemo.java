import java.io.IOException;

public class ExpressionsDemo {
    public static void main(String[] args) throws IOException {
        ExpressionService expression = new ExpressionService();
        String exp = "10 + 7";
        String content = expression.fileBuilder(exp);
        expression.fileWriter(content);
        expression.compileFile();
    }
}
