package Task6;

// **************
// *** Task 6 ***
// **************

// Functional interface is an interface witch can hold only one method
// And should be implemented by other classes
@FunctionalInterface
public interface CalculatorService {

    public int sumOfParameters(int ... nums);
}
