package Task9;

public class Main {
    public static void main(String [] args) {
        PowerCalculator calculator = new PowerCalculator();
        int number = 2;
        int extent = 10;
        long result = calculator.exponentiation(number, extent);
        System.out.println(number + " ^ " + extent + " : " + result);
    }
}
