public class Loops5 {
    public static int getTimesDivisible(int dividend, int divisor){
        if (dividend < 0 || divisor < 0){
            throw new IllegalArgumentException("Inputs cannot be negative");

        }
        if (divisor == 0 || divisor == 1) {
            throw new ArithmeticException("Divisor cannot be 0 or 1");

        }
        int count = 0;

        while (dividend > 0){
            dividend = dividend / divisor;
            if (dividend > 0){
                count ++;
            }
        }
        return count;
    }
}
