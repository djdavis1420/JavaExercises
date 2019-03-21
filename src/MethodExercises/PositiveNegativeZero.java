package MethodExercises;

public class PositiveNegativeZero {

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println(number + " is a positive number!");
        } else if (number < 0) {
            System.out.println(number + " is a negative number!");
        } else {
            System.out.println(number + " is equal to 0!");
        }
    }

}
