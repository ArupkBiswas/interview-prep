package streams.basic.numbers;

import java.util.Arrays;
import java.util.List;

/**
 * Filter Even Numbers from a List
*/

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,4,3,6,7,9,8);
        System.out.println(printEvenNumbers(list));
    }

    private static List<Integer> printEvenNumbers(List<Integer> list) {
        return list.stream().filter(s->s%2==0).toList();
    }
}
