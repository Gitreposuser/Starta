public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(222333444, "Samsung universum one", 121.5f);
        Phone phone2 = new Phone(111555999, "IPhone 19", 100.1f);
        Phone phone3 = new Phone(777000888, "Hang mung", 324.7f);

        phone1.receiveCall("Adam");
        System.out.println(phone1.getNumber());

        phone2.receiveCall("Tom");
        System.out.println(phone2.getNumber());

        phone3.receiveCall("John");
        System.out.println(phone3.getNumber());
    }
}