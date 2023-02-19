package Task6;

// **************
// *** Task 6 ***
// **************

public class CalculatorServiceInt implements CalculatorService{
    @Override
    public int sumOfParameters(int... nums) {
        int result = 0;
        for(int num: nums) {
            result += num;
        }
        return result;
    }
}
