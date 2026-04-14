package dsa.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,1,5,3,8};
        System.out.println("Missing numbers in the given array are : "+missingNumberFinder(arr));
    }

    private static List<Integer> missingNumberFinder(int[] a) {
        // find the max and min element in the array
        int max = Arrays.stream(a).max().getAsInt();
        int min = Arrays.stream(a).min().getAsInt();

        //put the array in the set so that there are no duplicate elements
        Set<Integer> st = Arrays.stream(a).boxed().collect(Collectors.toSet());

        // Return the list of elements that are not there in the set by iterating over min to max
        return IntStream.rangeClosed(min,max)
                .filter(x -> !st.contains(x))
                .boxed().toList();
    }
}
