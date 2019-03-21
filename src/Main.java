import MethodExercises.*;

public class Main {

    public static void main(String[] args) {

        // MethodExercises.PositiveNegativeZero
        System.out.println("-----MethodExercises.PositiveNegativeZero-----");
        PositiveNegativeZero.checkNumber(42);
        PositiveNegativeZero.checkNumber(-42);
        PositiveNegativeZero.checkNumber(0);

        //MethodExercises.SpeedConverter
        System.out.println("-----MethodExercises.SpeedConverter-----");
        long miles = SpeedConverter.toMilesPerHour(1.5);
        System.out.println("Miles = " + miles);
        miles = SpeedConverter.toMilesPerHour(10.25);
        System.out.println("Miles = " + miles);
        miles = SpeedConverter.toMilesPerHour(-5.6);
        System.out.println("Miles = " + miles);
        miles = SpeedConverter.toMilesPerHour(25.42);
        System.out.println("Miles = " + miles);
        miles = SpeedConverter.toMilesPerHour(75.114);
        System.out.println("Miles = " + miles);
        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-1);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);

        //MethodExercises.MegaBytesConverter
        System.out.println("-----MethodExercises.MegaBytesConverter-----");
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

        //MethodExercises.BarkingDog
        System.out.println("-----MethodExercises.BarkingDog-----");
        boolean wakeUp = BarkingDog.shouldWakeUp(true, 1);
        System.out.println("Wake Up: " + wakeUp);
        wakeUp = BarkingDog.shouldWakeUp(false, 2);
        System.out.println("Wake Up: " + wakeUp);
        wakeUp = BarkingDog.shouldWakeUp(true, 8);
        System.out.println("Wake Up: " + wakeUp);
        wakeUp = BarkingDog.shouldWakeUp(true, -1);
        System.out.println("Wake Up: " + wakeUp);

        //MethodExercises.LeapYear
        System.out.println("-----MethodExercises.LeapYear-----");
        boolean leapYear = LeapYear.isLeapYear(-1600);
        System.out.println("Leap Year: " + leapYear);
        leapYear = LeapYear.isLeapYear(1600);
        System.out.println("Leap Year: " + leapYear);
        leapYear = LeapYear.isLeapYear(2017);
        System.out.println("Leap Year: " + leapYear);
        leapYear = LeapYear.isLeapYear(2000);
        System.out.println("Leap Year: " + leapYear);

        //MethodExercises.DecimalComparator
        System.out.println("-----MethodExercises.DecimalComparator-----");
        boolean equals = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println("Equals: " + equals);
        equals = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println("Equals: " + equals);
        equals = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println("Equals: " + equals);
        equals = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println("Equals: " + equals);

        //MethodExercises.EqualSumChecker
        System.out.println("-----MethodExercises.EqualSumChecker-----");
        boolean equalSum = EqualSumChecker.hasEqualSum(1, 1, 1);
        System.out.println("EqualSum: " + equalSum);
        equalSum = EqualSumChecker.hasEqualSum(1, 1, 2);
        System.out.println("EqualSum: " + equalSum);
        equalSum = EqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println("EqualSum: " + equalSum);

        //MethodExercises.TeenNumberChecker
        System.out.println("-----MethodExercises.TeenNumberChecker-----");
        boolean teenNumber = TeenNumberChecker.hasTeen(9, 99, 19);
        System.out.println("HasTeen: " + teenNumber);
        teenNumber = TeenNumberChecker.hasTeen(23, 15, 42);
        System.out.println("HasTeen: " + teenNumber);
        teenNumber = TeenNumberChecker.hasTeen(22, 23, 34);
        System.out.println("HasTeen: " + teenNumber);

        //MethodExercises.BasicLengthConversion - Method Overloading
        System.out.println("-----MethodExercises.BasicLengthConversion-----");
        double empirical1 = BasicLengthConversion.calcFeetAndInchesToCentimeters(70);
        double empirical2 = BasicLengthConversion.calcFeetAndInchesToCentimeters(5, 10);
        System.out.println("Centimeters: " + empirical1);
        System.out.println("Centimeters: " + empirical2);
    }
}
