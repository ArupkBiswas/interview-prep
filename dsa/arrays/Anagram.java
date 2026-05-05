package dsa.arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listenr";
        String s2 = "silentr";

        if(isAnagram(s1,s2)){
            System.out.println("The given strings are anagram");
        } else {
            System.out.println("The given strings are not anagram");
        }
    }

    private static Boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;

        int arr[] = new int[26];

        for(int i = 0; i < s1.length(); i++){
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
            //System.out.println("s1 : "+(s1.charAt(i)-'a')+" s2 : "+(s2.charAt(i)-'a'));
        }

        for(int count : arr){
            if (count != 0)
                return false;
        }

        return true;
    }
}