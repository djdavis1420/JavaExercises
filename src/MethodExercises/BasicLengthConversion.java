package MethodExercises;

public class BasicLengthConversion {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid Parameters");
            return -1;
        } else {
            double totalInches = inches + (feet * 12);
            double totalCentimeters = totalInches * 2.54;
            System.out.println(feet + " feet and " + inches + " inches is equal to " + totalCentimeters + " centimeters.");
            return totalCentimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        } else {
            double totalFeet = (int) inches / 12;
            double remInches = inches % 12;
            System.out.println(inches + " inches is equal to " + totalFeet + " feet and " + remInches + " inches.");
            return calcFeetAndInchesToCentimeters(totalFeet, remInches);
        }
    }

}