package streams.basic.strings;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        System.out.println("Printing first non repetitive character: " + getFirstNonRepeatedCharacter(str));
        System.out.println("Printing first non repetitive character: " + getFirstNonRepChar(str).orElse(null));
    }

    private static Character getFirstNonRepeatedCharacter(String s) {
        return s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(count -> count.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Element not found"));
    }

    private static Optional<Character> getFirstNonRepChar(String s) {
        return s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> s.indexOf(c) == s.lastIndexOf(c))
                .findFirst();
    }
}
