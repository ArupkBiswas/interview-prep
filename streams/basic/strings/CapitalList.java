package streams.basic.strings;

import java.util.Arrays;
import java.util.List;

public class  CapitalList{

    public static void main(String[] args) {
        List<String> list = Arrays.asList("John", "Jack", "Doe", "jimmy");
        System.out.print(capitalizedList(list));
    }

    private static List<String> capitalizedList(List<String> list) {
       return list.stream().filter(s->s.toUpperCase().startsWith("J")).toList();
    }

//    public static void main(String[] args) {
//        List<String> list = Arrays.asList("John", "Jack", "Doe", "jimmy");
//        List<String> li = list.stream().filter(s->s.toLowerCase().startsWith("j")).map(String::toUpperCase).toList();
//        System.out.println(li);
//    }

}
