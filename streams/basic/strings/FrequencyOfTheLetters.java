package streams.basic.strings;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfTheLetters {
    public static void main(String[] args) {
        String s = "Java";
        System.out.println("Frequency of the letters are : "+ freqOfLetters(s));
    }

    private static Map<Character, Long> freqOfLetters(String s){
        Map<Character, Long> wordFreq= s.chars()
                .mapToObj(c -> (char) c)
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                );
        return wordFreq;
    }
}
