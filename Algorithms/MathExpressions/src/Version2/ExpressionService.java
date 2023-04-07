package Version2;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionService {
    private String expression;
    private LinkedList<Node> elements;

    public ExpressionService(String expression) {
        this.expression = expression;
        this.elements = new LinkedList<>();
    }

    private void splitExpressionToElements() {
        Pattern pattern = Pattern.compile("(\\d+)|(\\p{Punct})");
        Matcher matcher = pattern.matcher(expression);
        Variable va;
        Operator oper;
        while(matcher.find()) {
            if(matcher.group(1) != null) {
                System.out.println(" val " + matcher.group(0));
                va = new Variable();
                va.setData(Float.parseFloat(matcher.group(0)));
                elements.add(va);
            } else {
                System.out.println(" oper " + matcher.group(0));
                oper = new Operator();
                oper.setOperator(matcher.group(0));
                elements.add(oper);
            }
        }
    }

    public void cleanExpression() {
        char[] toRemove = new char[] {'~', '!', '@', '#', '$', '%', '^',
                '&', '_', '=', '{', '}', ':', ';', '"', '\\', '|',
                '<', '>', '?'};
        for(char chr: toRemove) {
            expression = expression.replace(chr, ' ');
        }
        expression = expression.replaceAll("\\s+","");
        System.out.println("expression: " + expression);
    }
    public void compileExpression() {
        cleanExpression();
        splitExpressionToElements();
        showElements();
    }

    public void showElements() {
        System.out.println("");
        for(Node nd: elements) {
            System.out.print(nd.getData().toString());
        }
    }
}