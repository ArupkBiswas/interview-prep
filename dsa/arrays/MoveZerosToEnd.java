package dsa.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 2, -1, 0, 0, -3, 5, 0, 0, 0, 0, 6};
        System.out.println(moveZeroToTheEnd1(arr));
        System.out.println(Arrays.toString(moveZeroToTheEnd2(arr)));
    }

    // Brute Force O(n) time O(n) space complexity
    private static List<Integer> moveZeroToTheEnd1(int[] a) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < a.length; i++ ){
            if(a[i] != 0) {
                list.add(a[i]);
            }
        }

        for(int i = list.size(); i < a.length; i++){
            list.add(0);
        }

        return list;
    }

    //Optimal solution with 2 pointer O(n) time, O(1) space complexity
    private static int[] moveZeroToTheEnd2(int[] a) {
        int left = 0, right = 0;

        while(right < a.length){
            if(a[left] == 0 && a[right] != 0){
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
            } else {
                right ++;
            }
        }

        return a;

    }
}
