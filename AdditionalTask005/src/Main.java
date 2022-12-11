public class Main {
    public static void main(String[] args) {

        ArrayCopy arrayTool = new ArrayCopy();
        int[] testArray = new int[] { -10, -5, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] result = arrayTool.copyInRange(testArray, -5, 3);

        for (int number : result) {
            System.out.println(" number : " + number);
        }
    }
}