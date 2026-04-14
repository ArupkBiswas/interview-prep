package dsa.slidingWindow;

public class MaxSumOfKElements {
    public static void main(String[] args) {
        //int[] arr = {10,20,5,12,1,4};
        int[] arr = {1, -1, 3, -2, -1};
        int target = 3;
        System.out.println(calculateMaxKSum(arr, target));
    }

    private static int calculateMaxKSum(int[] a, int k) {
        int max_len, window_len = 0;
        int n = a.length;

        if( n < k ) return -1;

        for(int i = 0; i < k; i++) {
            window_len += a[i];
        }

        max_len = window_len;

        for (int i = k; i < n; i++) {
            window_len += a[i] - a[i-k];
            max_len = Math.max(max_len, window_len);
        }

        return max_len;
    }
}
