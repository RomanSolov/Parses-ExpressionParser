package expression.exceptions;


import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ExpressionParser ss = new ExpressionParser();
        String str = "((x * y) max (x max 893296932))";

        //String str2 = "0 + - 1";
        System.out.println(ss.parse(str).toMiniString());
        //System.out.println(ss.parse(str,List.of("a","b")));
        //System.out.println(ss.parse(str,List.of("$0","$1", "$2", "$3", "$4")));
    }
}
