public class ConditionalStatements5 {
    public static String longestWord(String a, String b, String c){
        if (a.length() >= b.length() && a.length() >= c.length()){
            return a;
        } else if (b.length() >= a.length() && b.length() >= c.length()) {
            return b;
        } else {
            return c;
        }
    }
}
