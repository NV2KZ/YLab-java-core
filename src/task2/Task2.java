package task2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {5, 6, 3, 2, 5, 1, 4, 9};
        Sort.quickSort(array);
        assert Sort.isSorted(array): "array not sorted";
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    public static class Sort {
        public static void quickSort(int[] array) {
            assert (array != null): "array is null";
            recursionQuickSort(array, 0, array.length - 1);
        }

        public static void recursionQuickSort(int[] array, int min, int max) {
                assert (min >= 0): "min < 0";
                assert (max < array.length): "max >= array.length";

            {
                if (array.length == 0 || min >= max) return;

                int middleIndex = min + (max - min) / 2;
                int middleElement = array[middleIndex];

                int i = min, j = max;

                while (i <= j) {
                    while (array[i] < middleElement) {
                        i++;
                    }
                    while (array[j] > middleElement) {
                        j--;
                    }
                    if (i <= j) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        i++;
                        j--;
                    }
                }

                if (min < j) recursionQuickSort(array, min, j);

                if (max > i) recursionQuickSort(array, i, max);
            }

        }

        public static boolean isSorted(int[] array)
        {
            for (int i = 0; i < array.length - 1; i++)
                if (array[i] > array[i + 1]) {
                    return false;
                }
            return true;
        }
    }
}
