package ControlFlowExercises;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        int firstDigit = 0;
        int finalDigit = number % 10;

        while (number > 0) {
            int digit = number % 10;
            firstDigit = digit;
            number /= 10;
        }

        if (number < 0) {
            return -1;
        } else {
            return firstDigit + finalDigit;
        }
    }
}
