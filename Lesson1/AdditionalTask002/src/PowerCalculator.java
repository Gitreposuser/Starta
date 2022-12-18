public class PowerCalculator {
    private int number;
    private int exponent;
    private long result;

    public PowerCalculator(){
        this.number = 0;
        this.exponent = 1;
        this.result = 0;
    }

    public void exponentiation(int number, int exponent)
    {
        long result = number;

        try
        {
            for(int counter = 0; counter < exponent - 1; counter++)
            {
                result = Math.multiplyExact(result, number);
            }
        }
        catch(Exception e) {
            showError();
            result = 0;
        }
        this.result = result;
    }

    private void showError()
    {
        System.out.println("Error. Resulting number is to long.");
    }

    public void showResult()
    {
        System.out.println(this.result);
    }
}