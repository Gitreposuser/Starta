public class Main {
    public static void main(String[] args) {
        int [] array = ArrayService.generateArray();
        ArrayService.showArray(array);
        long result = ArrayService.calculateSumOfOddNumbers(array);
        System.out.println(" Summ of odd numbers is: " + result);
    }
}