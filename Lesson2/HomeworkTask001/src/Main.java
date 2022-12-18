public class Main {
    public static void main(String[] args) {
        Person tom = new Person();
        Person adam = new Person("Adam", 30);
        tom.move();
        tom.talk();

        adam.move();
        adam.talk();
    }
}