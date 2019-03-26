package ControlFlowExercises;

public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {

        boolean shared = false;

        if ((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)) {
            shared = false;
        } else {

            while (num1 > 0) {
                int num1digit = num1 % 10;

                if ((num1digit == num2 % 10) || (num1digit == num2 / 10)) {
                    shared = true;
                    break;
                }

                num1 /= 10;
            }
        }
        return shared;
    }
}
