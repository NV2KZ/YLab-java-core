package homework2.task3;

import java.util.stream.Collectors;

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
        assert (fuzzyString != null): "fuzzyString is null";
        assert (searchString != null): "searchString is null";

        String filteredString = searchString.chars()
                .mapToObj(e -> (char) e)
                .map(Object::toString)
                .filter(c -> filterNotInputCharacters(fuzzyString, c))
                .collect(Collectors.joining());

        return fuzzyString.equals(filteredString);
    }

    private static boolean filterNotInputCharacters(String fuzzyString, String character) {
        return fuzzyString.contains(character);
    }
}
