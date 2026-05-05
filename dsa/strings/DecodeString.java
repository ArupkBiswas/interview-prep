package dsa.strings;

import java.util.Stack;

public class DecodeString {
    /**
     * Decodes a string encoded as k[substring], where the substring
     * inside brackets is repeated exactly k times. Brackets can be nested.
     *
     * Example: "2[xy3[z]]" → "xyzzzxyzzz"
     */
    public static String decode(String s) {
        Stack<Integer> countStack = new Stack<>();   // stores repeat counts
        Stack<StringBuilder> stringStack = new Stack<>(); // stores built strings before '['
        StringBuilder current = new StringBuilder(); // current working string
        int k = 0; // current number being parsed

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Build multi-digit numbers (e.g., 12 in "12[ab]")
                k = k * 10 + (ch - '0');

            } else if (ch == '[') {
                // Push current count and string onto stacks, reset both
                countStack.push(k);
                stringStack.push(current);
                current = new StringBuilder();
                k = 0;

            } else if (ch == ']') {
                // Pop count and previous string, repeat current string count times
                int repeatCount = countStack.pop();
                StringBuilder previous = stringStack.pop();
                for (int i = 0; i < repeatCount; i++) {
                    previous.append(current);
                }
                current = previous;

            } else {
                // Regular character — just append
                current.append(ch);
            }
        }

        return current.toString();
    }

    public static void main(String[] args) {
        String[] testCases = {
                "2[xy3[z]]",     // → xyzzzxyzzz
                "3[a]",          // → aaa
                "2[ab]",         // → abab
                "2[a2[b]]",      // → abbabb
                "3[a2[bc]]",     // → abcbcabcbcabcbc
                "abc",           // → abc  (no encoding)
        };

        System.out.println("Decode String Results:");
        System.out.println("=".repeat(40));
        for (String input : testCases) {
            System.out.printf("Input:  %-20s → Output: %s%n", input, decode(input));
        }
    }
}

