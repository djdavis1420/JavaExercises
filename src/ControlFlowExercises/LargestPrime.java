package ControlFlowExercises;

public class LargestPrime {

    public static int getLargestPrime(int number) {

        int largestPrime = -1;

        if (number > 0) {

            for (int i = 1; i < number; i++) {
                if ((isPrime(i)) && (number % i == 0)) {
                    largestPrime = i;
                }
            }
        }
        return largestPrime;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
