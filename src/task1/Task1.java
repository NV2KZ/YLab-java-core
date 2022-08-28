package task1;

import java.util.Arrays;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        CustomRandom.randomTwoDArray(array);
        System.out.println("Двумерный массив:\n" + Arrays.deepToString(array));
        System.out.println("Максимальное занчение: " + maxValue(array));
        System.out.println("Минимальное занчение: " + minValue(array));
        System.out.println("Среднее занчение: " + avgValue(array));

    }

    public static int maxValue(int[][] array) {
        int max = 0;
        for (int[] intColumn : array) {
            for (int intRow : intColumn) {
                if (intRow > max) max = intRow;
            }
        }
        return max;
    }

    public static int minValue(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int[] intColumn : array) {
            for (int intRow : intColumn) {
                if (intRow < min) min = intRow;
            }
        }
        return min;
    }

    public static double avgValue(int[][] array) {
        int sum = 0;
        int indexCounter = 0;
        for (int[] intColumn : array) {
            for (int intRow : intColumn) {
                sum += intRow;
                indexCounter++;
            }
        }
        return sum/(double) indexCounter;
    }

    static class CustomRandom {
        private static final Date date = new Date();
        private static final int a = (int) date.getTime();
        private static final int c = 119;
        private static final int m = 113;
        private static int seed = 1;

        private static int getNextRandom() {
            seed = (a * seed + c) % m;
            return seed;
        }

        public static void randomTwoDArray(int[][] array) {
            for (int column = 0; column < array.length; column++) {
                for (int row = 0; row < array[column].length; row++) {
                    array[column][row] = getNextRandom();
                }
            }
        }
    }
}
