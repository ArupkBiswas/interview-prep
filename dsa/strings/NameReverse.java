package dsa.strings;

import java.beans.PropertyEditorSupport;

import static java.lang.System.in;

/// input -> "arup123biswas"
/// output -> "pura123sawsib"

public class NameReverse {
    public static void main(String[] args) {
        System.out.println(reverseName("arup123biswas"));
    }

    private static String reverseName(String str) {
        StringBuilder res = new StringBuilder();
        int i = 0;

        while(i < str.length()){
            // Step 1: If digit, add it directly to result and move on
            if(Character.isDigit(str.charAt(i))){
                res.append(str.charAt(i));
                i++;
                continue;
            }
            // Step 2: Found a letter — mark group start
            int grpStart = i;

            // Step 3: Move forward until digit or end
            while (i< str.length() && !Character.isDigit(str.charAt(i))){
                i++;
            }

            // Step 4: Cut out the letter group using substring
            String letterGrp = str.substring(grpStart, i);

            res.append(new StringBuilder(letterGrp).reverse());
        }

        return res.toString();

    }
}
