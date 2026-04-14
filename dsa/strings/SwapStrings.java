package dsa.strings;

/// S1= "Java", S2 = "Software"
/// write the code in java to swap the values without using 3rd variable and loops

public class SwapStrings {
    public static void main(String[] args) {
        String s = "Java";
        String r = "Software";
        System.out.println("Previous value of S1 = "+s+" S2 = "+r);
        String[] result = swapStringsWithoutLoopOrThirdVar(s,r);
        System.out.println("After swaping the S1 = "+result[0]
                +" S2 = "+result[1]);
    }

    private static String[] swapStringsWithoutLoopOrThirdVar(String s, String r){
        s = s+r;
        r = s.substring(0, s.length()-r.length());
        s = s.substring(r.length()); //strats from r.length() till string end, its exclusive

        return new String[]{s,r};
    }
}
