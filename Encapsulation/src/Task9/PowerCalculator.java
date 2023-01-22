package Task9;

public class PowerCalculator {

    public long exponentiation(int number, int exponent) {
        long result = number;

        try {
            for (int counter = 0; counter < exponent - 1; counter++) {
                result = Math.multiplyExact(result, number);
            }
        } catch (Exception e) {
            showError();
            result = 0;
        }
        return result;
    }

    private void showError() {
        System.out.println("Error. Resulting number is to long.");
    }
}
