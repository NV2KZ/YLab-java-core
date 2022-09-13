package homework2.task2;

import java.util.HashMap;
import java.util.Map;

public class ResultPair {
    /*
    Task2

    [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
    */
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 7};
        int sum = 10;
        resultPair(array, sum);
    }

    public static void resultPair(int[] array, int sum) {
        if (array == null) {
            System.out.println("Input array is null");
            return;
        }
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(sum - array[i])) {
                System.out.printf("[%d, %d]", array[map.get(sum - array[i])], array[i]);
                return;
            }
            map.put(array[i], i);
        }
        System.out.println("Pair not found");
    }
}
