package Task21;

import java.util.Random;

public class TwoDimensionalArray {
    float [][] createArray(final int rows, final int columns) {
        float [][] result = new float[rows][columns];
        return result;
    }

    void fillArrayWithRandomNumbers(float [][] array,
            final int rows, final int columns, final float bound) {
        Random rnd = new Random();
        for(int column = 0; column < columns; column++) {
            for(int row = 0; row < rows; row++) {
                array[row][column] = rnd.nextFloat(bound);
            }
        }
    }

    float calculateSumOfArrayElements(float [][] array,
            final int rows, final int columns) {
        float result = 0;
        for(int column = 0; column < columns; column++) {
            for(int row = 0; row < rows; row++) {
                result += array[row][column];
            }
        }
        return result;
    }

    void showArray(float [][] array, final int rows,
                   final int columns) {
        for(int column = 0; column < columns; column++) {
            for(int row = 0; row < rows; row++) {
                System.out.printf("[%1d][%1d] = %7.3f  ", row, column, array[row][column]);
            }
            System.out.println("");
        }
    }

    public static void main(String [] args) {
        TwoDimensionalArray arrayService = new TwoDimensionalArray();
        int rows = 5;
        int columns = 5;
        float [][] array = arrayService.createArray(rows, columns);
        arrayService.fillArrayWithRandomNumbers(array, rows, columns, 100);
        arrayService.showArray(array, rows, columns);
        float sumOfElements = arrayService.calculateSumOfArrayElements(array, rows, columns);
        System.out.println("Sum of elements = " + sumOfElements);
    }
}
