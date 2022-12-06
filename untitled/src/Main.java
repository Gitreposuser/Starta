
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.CarInfo();
        car.Beep(car.typeOfSignal);

        Car newCar = new Car("SkyLine", "Nissan", 2000, "boop boop");
        newCar.CarInfo();
        newCar.Beep(newCar.typeOfSignal);
    }
}