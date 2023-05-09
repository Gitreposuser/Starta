package Version2;

public class Operator implements Element, OperatorProperties{
    private String operator;
    private int priority;

    public <String> String getData() {
        return (String) operator;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public boolean isOperator() {
        return true;
    }

    @Override
    public boolean isScope() {
        if(operator.equals("(") || operator.equals(")")){
            return true;
        }
        return false;
    }

    @Override
    public int getOperatorPriority() {
        return priority;
    }

    @Override
    public void setOperatorPriority(int priority) {
        this.priority = priority;
    }
}