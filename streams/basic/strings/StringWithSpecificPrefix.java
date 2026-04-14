package streams.basic.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/// Count strings starting with a specific prefix, e.g., “A”.
///
public class StringWithSpecificPrefix {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie", "Arup");
        System.out.println("Number of strings that starts with 'A' is : " + countStringsWithSpecificPrefix(names));
        System.out.println("All uppercase : " + convertListOfStringsToUpperCase(names));
    }

    private static Long countStringsWithSpecificPrefix(List<String> list) {
        return list.stream().filter(s -> s.startsWith("A")).count();
    }

    private static List<String> convertListOfStringsToUpperCase(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

}
