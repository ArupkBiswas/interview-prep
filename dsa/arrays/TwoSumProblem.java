package dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] arr = {2,5,6,4,3,7,9};
        int target = 12;
        System.out.println("the position of the elements are  : "+ Arrays.toString(checkTwoSum(arr, target)));
    }

    public static int[] checkTwoSum(int[] nums, int target) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int  i = 0; i < nums.length; i++){
            freq.put(nums[i], i);
        }

        for(int i= 0; i< nums.length; i++){
            int comp = target - nums[i];
            if(freq.containsKey(comp) && freq.get(comp) != i)
                return new int[] {freq.get(comp),i};
        }
        return new int[] {-1,1};
    }
}
