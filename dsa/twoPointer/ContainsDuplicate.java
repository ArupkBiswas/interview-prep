package dsa.twoPointer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

///  Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
///
/// Example 1:
///
/// Input: nums = `[1, 2, 3, 3]`
///
/// Output: `true`
///
/// Example 2:
///
/// Input: nums = `[1, 2, 3, 4]`
///
/// Output: `false`

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};
        if(checkDuplicate(arr)) {
            System.out.println("The array contains duplicate values");
        } else {
            System.out.println("The array does not contains duplicate values");
        }
    }

    private static boolean checkDuplicate(int[] num) {
//        List<Integer> listNum = Arrays.stream(num).boxed().toList();
//        Map<Integer, Long> freqMap = listNum.stream()
//                .collect(
//                        Collectors.groupingBy(
//                                Function.identity(),
//                                Collectors.counting()
//                        ));
//        for(Map.Entry<Integer, Long> x : freqMap.entrySet()){
//            if(x.getValue() > 1)
//                return true;
//        }
//        return false;

        return Arrays.stream(num).distinct().count() < num.length;
    }
}
