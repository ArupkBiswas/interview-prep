package streams.basic.numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDescendingOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,7,4,23,8);
        System.out.println("Ascending Order list : "+printAscendingList(list));
        System.out.println("Ascending Order list : "+printDescendingList(list));
    }

    private static List<Integer> printAscendingList(List<Integer> list){
        return list.stream().sorted().toList();
    }

    private static List<Integer> printDescendingList(List<Integer> list){
        return list.stream().sorted(Comparator.reverseOrder()).toList();
    }
}
