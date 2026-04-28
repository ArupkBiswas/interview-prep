package streams.basic.numbers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddList {
    public static void main(String[] args) {
        int[] arr = {10,29,3,22,44,55,33,66,77,88};
        findEvenOddLists(arr);
    }

    private static void findEvenOddLists(int[] arr) {
        Map<Boolean, List<Integer>> combineList = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(n ->n%2==0));

        System.out.println(combineList);

        List<Integer> evenList = combineList.get(true);
        List<Integer> oddList = combineList.get(false);

        System.out.println("Even list : "+ evenList);
        System.out.println("Odd list : "+oddList);
    }
}
