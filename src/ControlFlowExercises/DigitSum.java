package ControlFlowExercises;

public class DigitSum {

    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        } else {
            int sumOfDigits = 0;

            while (number > 0) {
                int currentDigit = number % 10;
                sumOfDigits = sumOfDigits + currentDigit;
                number = number / 10;
            }

            return sumOfDigits;
        }
    }
}
