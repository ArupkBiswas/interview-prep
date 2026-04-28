package dsa.arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/// Given an integer array nums and an integer `k`, return the `k` most frequent elements within the array.
///
/// The test cases are generated such that the answer is always unique.
///
/// You may return the output in any order.
///
/// Example 1:
///
/// Input: `nums = [1,2,2,3,3,3], k = 2`
///
/// Output: `[2,3]`
///
/// Example 2:
///
/// Input: `nums = [7,7], k = 1`
///
/// Output: `[7]`

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] n = {7,7};
        System.out.println("The frequent elements are : "+ Arrays.toString(findKFreqElements(n)));
    }

    private static int[] findKFreqElements(int[] n) {
        int k = 1;
        Map<Integer, Long> freqMap = Arrays.stream(n).boxed().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )
        );

        System.out.println(freqMap);

        int[] elem = new int [k];
        int i = 0;
        for(Map.Entry<Integer, Long> newMap : freqMap.entrySet()){
            if(newMap.getValue() > 1) {
                elem[i] = newMap.getKey();
                i++;
            }
        }

        return elem;
    }
}
