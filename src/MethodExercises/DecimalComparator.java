package MethodExercises;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        double scale = Math.pow(10, 4);
        if (((int)(num1 * 1000)) == ((int)(num2 * 1000))) {
            return true;
        }
        return false;
    }
}
