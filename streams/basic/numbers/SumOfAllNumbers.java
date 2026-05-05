package streams.basic.numbers;

import java.util.List;
import java.util.Arrays;

/// Calculate the sum of all numbers in a list.

public class SumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum : "+numbers.stream().mapToInt(Integer::intValue).sum());
        System.out.println("Average : "+numbers.stream().mapToInt(Integer::intValue).average().orElse(-1));
    }
}
