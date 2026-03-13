package dsa.strings;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "abaabb";
        System.out.println("Longest Palindromic substring :" + longestPalindromicSubString(str));
    }

    private static String longestPalindromicSubString(String str) {

        int n = str.length();
        int startingIndex = 0;
        int maxLength = 0;

        for(int i = 0; i < n; i++){
            int k = 0;
            while((i-k) >= 0
                    && i+k < n
                    && str.charAt(i-k) == str.charAt(i+k)){
                k++;
            }
            k--;

            if(( i + k ) - ( i - k ) + 1 > maxLength){
                startingIndex = i - k;
                maxLength = ( i + k ) - ( i - k ) + 1;
            }
        }

        for( double i = 0.5; i < n; i++){
            double k = 0.5;
            while((i-k) >= 0
                    && i+k < n
                    && str.charAt((int)(i-k)) == str.charAt((int)(i+k))
            ){
                k++;
            }
            k--;

            if(( i + k ) - ( i - k ) + 1 > maxLength){
                startingIndex = (int) (i - k);
                maxLength = (int) (( i + k ) - ( i - k ) + 1);
            }

        }

        return str.substring(startingIndex, maxLength+1); // need to add 1 to the maxLength as in .substring() endIndex is exclusive

    }
}
