package ControlFlowExercises;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int originalNumber = Math.abs(number);
        int reverseNumber = 0;
        number = Math.abs(number);

        while (number > 0) {
            reverseNumber *= 10;
            int lastDigit = number % 10;
            reverseNumber += lastDigit;
            number /= 10;
        }

        if (originalNumber == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }
}
