package ControlFlowExercises;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        } else {

            int num1digit = num1 % 10;
            int num2digit = num2 % 10;
            int num3digit = num3 % 10;

            return ((num1digit == num2digit) || (num2digit == num3digit) || (num3digit == num1digit));

        }
    }

    public static boolean isValid(int num) {
        return (num >= 10) && (num <= 1000);
    }
}
