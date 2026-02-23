package dsa.patterns;

import java.util.Scanner;

public class SquarePattern {

    static void printLine(){
        System.out.println("------------------------------ Printing Pattern ------------------------------------------");
    }

    public static void main(String[] args) {
        printInvertedTriangleNum();
        printInvertedStarTriangle();
        printSameNumTriangle();
        printIncreasingNumberTriangle();
        printSquare();
        printStarTriangle();
        printIsoscelesTriangle();
    }

    private static void printIsoscelesTriangle() {
        printLine();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();

        for(int i=1; i <= rows ; i++) {
            for (int j=rows-i; j > 0; j--)
                System.out.print(" ");
            for(int k = 1; k <= (2*i-1) ; k++)
                System.out.print("*");
            System.out.println();
        }
    }

    private static void printInvertedTriangleNum() {
        printLine();
        for(int i = 5; i >= 1; i--){
            for(int j = 1 ; j <= i; j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }

    private static void printInvertedStarTriangle() {
        printLine();
        for(int i = 5; i >= 1; i --) {
            for(int j = i; j >= 1 ; j--){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    private static void printSameNumTriangle() {
        printLine();
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }

    private static void printIncreasingNumberTriangle() {
        printLine();
        for(int i = 1; i<= 5 ; i ++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }

    private static void printStarTriangle() {
        printLine();
        for(int i=0; i<5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* \t");
            }
            System.out.print("\n");
        }
    }

    private static void printSquare(){
        printLine();
        for(int i=0; i<5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* \t");
            }
            System.out.print("\n");
        }
    }
}
