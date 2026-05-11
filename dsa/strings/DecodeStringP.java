package dsa.strings;

import java.util.Stack;

public class DecodeStringP {
    public static void main(String[] args) {
        String s = "3(xy2(z))";
        System.out.println(decodeGivenString(s));
    }

    //Brute Force Approach


    //Optimal solution with 2 pointer O(n) time, O(1) space complexity
    private static String decodeGivenString (String str){
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                k = k*10+(c-'0');
            } else if(c == '[' || c == '(') {
                countStack.push(k);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                k = 0;
            } else if(c == ']' || c == ')' ) {
                int repCount = countStack.pop();
                StringBuilder previous = stringStack.pop();
                for(int i = 0; i < repCount; i++){
                    previous.append(currentString);
                }
                currentString = previous;

            } else {
                currentString.append(c);
            }
        }

        return currentString.toString();
    }
}
