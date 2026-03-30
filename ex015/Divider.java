public class Divider {
    public static double divide(int numerator, int denominator){
        if (denominator == 0){
            throw new ArithmeticException("division by zero");
        }
        return (double) numerator / denominator;
    }
}
