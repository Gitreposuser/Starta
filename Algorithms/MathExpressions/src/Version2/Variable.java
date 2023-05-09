package Version2;

public class Variable implements Element {
    private Float data;

    public <Float> Float getData() {
        return (Float) data;
    }

    public void setData(float data) {
        this.data = data;
    }

    @Override
    public boolean isOperator() {
        return false;
    }

    @Override
    public boolean isScope() {
        return false;
    }
}
