package streams.basic.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MaximumNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 90, 30, 40, 50);
        System.out.println("The Maximum in the list is : "+maxInTheList(list));
        System.out.println("Minimum is : "+minInTheList(list));
    }

    private static Integer maxInTheList(List<Integer> list) {
        return list.stream()
                .max(Integer::compare)
                .orElseThrow();
    }

    private static Integer minInTheList(List<Integer> list) {
        return list.stream()
                .min(Integer::compare)
                .orElseThrow();
    }

}
