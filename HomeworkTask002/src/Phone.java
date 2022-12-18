public class Phone {
    private long number;
    private String model;
    private float weight;

    public Phone( long number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling.");
    }

    public long getNumber() {
        return this.number;
    }
}