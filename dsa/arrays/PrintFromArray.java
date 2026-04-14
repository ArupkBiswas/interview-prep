package dsa.arrays;

import java.util.Scanner;

/// int a = {10,15,20,25} and number if n =1 print 10,15,n=2 print 20,25 using java

public class PrintFromArray {
    public static void main(String[] args) {
        int[] a = {10,15,20,25};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        System.out.println("list : "+elementsFromArray(a,n));
    }

    private static int[] elementsFromArray(int[] a, int n) {

    }
}
