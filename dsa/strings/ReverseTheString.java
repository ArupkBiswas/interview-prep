package dsa.strings;

/// check the string "racecar" if its palindrome or not, without using inbuilt functions.
///  TWO - POINTER APPROACH
public class ReverseTheString {
    public static void main(String[] args) {
        String s = "racecar";
        if(checkPalindrome(s))
            System.out.println("The String is palindrome");
        else
            System.out.println("The string is not a palindrome");
    }

    private static boolean checkPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
