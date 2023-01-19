public class SomeClass {
    public void variableParameters(int ...nums) {
        int counter = 1;
        for(int param: nums) {
            System.out.println(" parameter [" + counter + "] : " + param);
            counter++;
        }
    }

    public int sumOfVariables(int ...nums) {
        int result = 0;
        for(int param: nums) {
            result += param;
        }
        return result;
    }
}
