package streams.basic.numbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] a = {1,2,3,1};
        System.out.println(" The List contains duplicate : "+containsDuplicateValue(a));
    }

    private static boolean containsDuplicateValue(int[] a) {
        return Arrays.stream(a).distinct().count() != a.length;
//        Set<Integer> s = new HashSet<>();
//        return Arrays.stream(a).anyMatch(n -> !s.add(n));
    }
}
