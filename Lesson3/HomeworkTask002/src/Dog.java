public class Dog extends Animal {
    private String name;
    private String sound;

    public Dog(String name, String sound, int personalNumber) {
        this.personalIdNumber = personalNumber;
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return this.name;
    }

    public void produceSound() {
        System.out.println(" Dog barks: " + sound);
    }
}
