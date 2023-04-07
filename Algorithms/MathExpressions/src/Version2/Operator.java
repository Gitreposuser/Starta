package Version2;

public class Operator implements Node{
    private String operator;

    public <String> String getData() {
        return (String) operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public boolean isOperator() {
        return true;
    }
}