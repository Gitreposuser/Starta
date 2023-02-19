package Task6;

// **************
// *** Task 6 ***
// **************

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        CalculatorService calculator = new CalculatorServiceInt();
        int result = calculator.sumOfParameters(1, 2, 3, 1);
        System.out.println("Sum of all parameters is: " + result);

        result = calculator.sumOfParameters(1, 0, 0, 10, 10);
        System.out.println("Sum of all parameters is: " + result);
    }
}