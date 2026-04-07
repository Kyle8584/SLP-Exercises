public class Loops6 {
    public static int investmentCalculator(double principal, double rate, double target ){
       if (principal < 0 || rate < 0 || target < 0){
        throw new IllegalArgumentException("Inputs cannot be negative");

       }
       if (principal == 0 || rate == 0){
        throw new ArithmeticException("Calculation cannot proceed with zero principal or zero rate ");

       }
       if (principal >= target){
        return 0;
       }
       int years = 0;

       while (principal < target){
        principal = principal + (principal * rate/ 100.0);
        years++;

       }
       return years;

    }
}
