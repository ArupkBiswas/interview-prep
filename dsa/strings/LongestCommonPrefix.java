package dsa.strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flute", "flue"};
        System.out.println("The longest common prefix is : "+longestCommPrefix(str));
    }

    private static String longestCommPrefix(String[] str) {
        if(str == null || str.length == 0) return "";
        String prefix = str[0];
        for(String s : str){
            while(s.indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}

