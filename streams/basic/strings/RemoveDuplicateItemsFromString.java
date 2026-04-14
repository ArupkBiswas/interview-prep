package streams.basic.strings;

import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateItemsFromString {
    public static void main(String[] args) {
        String s = "Banana";
        System.out.println("Original String --> "+s);
        System.out.println("Removing the duplicate --> " +removeDuplicate(s));
    }

    private static Set<Character> removeDuplicate(String s) {
        return s.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
    }
}
