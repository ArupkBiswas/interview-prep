package streams.basic.strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "apple is on the ground ";
        System.out.println("Number of characters in last word : "+lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        int l = s.length()-1;
        int count = 0;
        while( l >= 0 ) {
            if (s.charAt(l) != ' ') {
                count++;
            } else if (count > 0) {
                return count;
            }
            l--;
        }
        return count;
    }
}
