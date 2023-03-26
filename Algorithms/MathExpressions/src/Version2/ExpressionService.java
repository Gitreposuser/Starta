package Version2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ExpressionService {
    public String getExpressionFromUI() {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        return expression;
    }

    public String[] parsExpression(String expression) {
        return expression.split(" ");
    }



    //public LinkedList<Operator> compileExpression(String expression) {
    //}
}
