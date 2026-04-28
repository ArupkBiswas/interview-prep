package streams.basic.numbers;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {55,33,22,88,77,99};
        System.out.println("The Kth smallest number is : "+ findKthSmallest(arr));
    }

    private static int findKthSmallest(int[] arr) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Input the position of the element : ");
        int k = 2;

        return Arrays.stream(arr).sorted().skip(k-1).findFirst().orElse(-1);
    }
}
