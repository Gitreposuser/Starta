package Version1;

import java.io.IOException;

public class ExpressionsDemo {
    public static void main(String[] args) throws IOException {
        ExpressionService expression = new ExpressionService();
        String exp = "15 + 7 * (3 - 2)";
        String content = expression.fileBuilder(exp);
        expression.fileWriter(content);
        expression.compileFile();
        System.out.println("1st stage");

        while(!expression.isFileCreated()) {
            System.out.println("Not created");
        };

        while(!expression.isFileReady()) {
            System.out.println("Not ready");
        };

        expression.runFile();
        System.out.println("2nd stage");
    }
}
