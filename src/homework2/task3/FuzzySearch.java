package homework2.task3;

import java.util.ArrayList;
import java.util.List;

public class FuzzySearch {
    /*
    Task3

        Реализовать функцию нечеткого поиска
            fuzzySearch("car", "ca6$$#_rtwheel"); // true
            fuzzySearch("cwhl", "cartwheel"); // true
            fuzzySearch("cwhee", "cartwheel"); // true
            fuzzySearch("cartwheel", "cartwheel"); // true
            fuzzySearch("cwheeel", "cartwheel"); // false
            fuzzySearch("lw", "cartwheel"); // false
    */
    public static void main(String[] args) {
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel"));
        System.out.println(fuzzySearch("cwhl", "cartwheel"));
        System.out.println(fuzzySearch("cwhee", "cartwheel"));
        System.out.println(fuzzySearch("cartwheel", "cartwheel"));
        System.out.println(fuzzySearch("cwheeel", "cartwheel"));
        System.out.println(fuzzySearch("lw", "cartwheel"));
    }

    public static boolean fuzzySearch(String fuzzyString, String searchString) {

        if (fuzzyString == null || searchString == null) {
            return false;
        }

        List<Character> listOfCharsFuzzyString = new ArrayList<>();
        List<Character> listOfCharsSearchString = new ArrayList<>();

        for (char c : fuzzyString.toCharArray()) {
            listOfCharsFuzzyString.add(c);
        }

        for (char c : searchString.toCharArray()) {
            listOfCharsSearchString.add(c);
        }

        listOfCharsSearchString.retainAll(listOfCharsFuzzyString);

        return listOfCharsFuzzyString.equals(listOfCharsSearchString);
    }
}

