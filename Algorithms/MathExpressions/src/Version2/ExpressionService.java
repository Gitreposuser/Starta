package Version2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionService {
    private String expression;
    private LinkedList<Element> elements;
    private float result;

    public ExpressionService(String expression) {
        this.expression = expression;
        this.elements = new LinkedList<>();
    }

    private void splitExpressionToElements() {
        Pattern pattern = Pattern.compile("(\\d+)|(\\p{Punct})");
        Matcher matcher = pattern.matcher(expression);
        Variable variable;
        Operator operator;
        while(matcher.find()) {
            if(matcher.group(1) != null) {
                variable = new Variable();
                variable.setData(Float.parseFloat(matcher.group(0)));
                elements.add(variable);
            } else {
                operator = new Operator();
                operator.setOperator(matcher.group(0));
                elements.add(operator);
            }
        }
    }

    private void cleanExpression() {
        char[] toRemove = new char[] {'~', '!', '@', '#', '$', '%', '^',
                '&', '_', '=', '{', '}', ':', ';', '"', '\\', '|',
                '<', '>', '?'};
        for(char chr: toRemove) {
            expression = expression.replace(chr, ' ');
        }
        expression = expression.replaceAll("\\s+","");
    }

    private void setOperatorPriority() {
        int priorityMultiplayer = 0;
        for(Element element : elements) {
            if(!element.isOperator()) {
                continue;
            }
            if(element.isScope()) {
                if (element.getData().equals("(")) {
                    priorityMultiplayer += 2;
                } else {
                    priorityMultiplayer -= 2;
                }
            }
            if(element.getData().equals("+") || element.getData().equals("-")) {
                final int priority = 1;
                ((OperatorProperties) element).setOperatorPriority(priority + priorityMultiplayer);
            }
            if(element.getData().equals("*") || element.getData().equals("/")) {
                final int priority = 2;
                ((OperatorProperties) element).setOperatorPriority(priority + priorityMultiplayer);
            }
        }
    }

    private void removeScopesFromExpression() {
        elements.removeIf(x -> x.getData().equals("(") ||
                x.getData().equals(")"));
    }

    public void compileExpression() {
        cleanExpression();
        splitExpressionToElements();
        setOperatorPriority();
        removeScopesFromExpression();
    }

    private int getIndexOfMaxPriorityOperator() {
        int index = -1;
        int maxPriority = 0;
        for(Element element: elements) {
            if(!element.isOperator()){
                continue;
            }
            int curPriority =
                    ((OperatorProperties)element).getOperatorPriority();
            if(maxPriority < curPriority) {
                maxPriority = curPriority;
                index = elements.indexOf(element);
            }
        }
        return index;
    }

    private void executeOperator(int indexOfOperator) {
        float leftVar = elements.get(indexOfOperator - 1).getData();
        float rightVar = elements.get(indexOfOperator + 1).getData();
        float result = 0;

        if(elements.get(indexOfOperator).getData().equals("+")) {
            result = leftVar + rightVar;
        }
        if(elements.get(indexOfOperator).getData().equals("-")) {
            result = leftVar - rightVar;
        }
        if(elements.get(indexOfOperator).getData().equals("*")) {
            result = leftVar * rightVar;
        }
        if(elements.get(indexOfOperator).getData().equals("/")) {
            result = leftVar / rightVar;
        }

        Element resElement = new Variable();
        ((Variable)resElement).setData(result);
        elements.add(indexOfOperator - 1, resElement); // Add before left
        elements.remove(indexOfOperator);   // Remove left
        elements.remove(indexOfOperator);   // Remove operator
        elements.remove(indexOfOperator);   // Remove right
    }

    public void executeExpression() {
        while(elements.size() > 1) {
            int indexOfOperator = getIndexOfMaxPriorityOperator();
            executeOperator(indexOfOperator);
        }
        result = elements.get(0).getData();
    }

    public void showResult() {
        System.out.println("Result is: " + result);
    }

    // Debug methods
    public void showElements() {
        System.out.println();
        for(Element element : elements) {
            System.out.print(element.getData().toString());
        }
        System.out.println();
    }

    public void showElementsDetailed() {
        System.out.println();
        for(Element element : elements) {
            if(element.isScope()) {
                System.out.println(element.getData().toString() + " is scope");
                continue;
            }
            if(element.isOperator()) {
                int priority = ((OperatorProperties) element).getOperatorPriority();
                System.out.println(element.getData().toString() + " priority = " +
                        priority);
                continue;
            }
            System.out.println(element.getData().toString());
        }
    }
}