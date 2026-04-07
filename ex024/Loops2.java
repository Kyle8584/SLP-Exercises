public class Loops2 {
    public static String getRange(int start, int end, int step){
        if (step <= 0 || start >= end) {
            return "";
        }
        String result = "";
        for (int i = start; i < end; i += step){
            result += "(" + i + ")";
        }
        return result;
    }
}
