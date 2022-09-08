package homework2.task2;

import java.util.ArrayList;
import java.util.List;

public class ResultPair {
    /*
    Task2

    [3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
    */
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 7};
        int number = 10;
        System.out.println(resultPair(array, number));
    }

    public static String resultPair(int[] array, int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    result.add(array[i]);
                    result.add(array[j]);
                    return result.toString();
                }
            }
        }
        return "Elements not found";
    }
}
