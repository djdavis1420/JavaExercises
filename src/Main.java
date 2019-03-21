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
        System.out.println("Miles = " + SpeedConverter.toMilesPerHour(1.5));
        System.out.println("Miles = " + SpeedConverter.toMilesPerHour(10.25));
        System.out.println("Miles = " + SpeedConverter.toMilesPerHour(-5.6));
        System.out.println("Miles = " + SpeedConverter.toMilesPerHour(25.42));
        System.out.println("Miles = " + SpeedConverter.toMilesPerHour(75.114));
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
        System.out.println("Wake Up: " + BarkingDog.shouldWakeUp(true, 1));
        System.out.println("Wake Up: " + BarkingDog.shouldWakeUp(false, 2));
        System.out.println("Wake Up: " + BarkingDog.shouldWakeUp(true, 8));
        System.out.println("Wake Up: " + BarkingDog.shouldWakeUp(true, -1));

        //MethodExercises.LeapYear
        System.out.println("-----MethodExercises.LeapYear-----");
        System.out.println("Leap Year: " + LeapYear.isLeapYear(-1600));
        System.out.println("Leap Year: " + LeapYear.isLeapYear(1600));
        System.out.println("Leap Year: " + LeapYear.isLeapYear(2017));
        System.out.println("Leap Year: " + LeapYear.isLeapYear(2000));

        //MethodExercises.DecimalComparator
        System.out.println("-----MethodExercises.DecimalComparator-----");
        System.out.println("Equals: " + DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println("Equals: " + DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println("Equals: " + DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println("Equals: " + DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));

        //MethodExercises.EqualSumChecker
        System.out.println("-----MethodExercises.EqualSumChecker-----");
        System.out.println("EqualSum: " + EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println("EqualSum: " + EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println("EqualSum: " + EqualSumChecker.hasEqualSum(1, -1, 0));

        //MethodExercises.TeenNumberChecker
        System.out.println("-----MethodExercises.TeenNumberChecker-----");
        System.out.println("HasTeen: " + TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println("HasTeen: " + TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println("HasTeen: " + TeenNumberChecker.hasTeen(22, 23, 34));

        //MethodExercises.BasicLengthConversion - Method Overloading
        System.out.println("-----MethodExercises.BasicLengthConversion-----");
        System.out.println("Centimeters: " + BasicLengthConversion.calcFeetAndInchesToCentimeters(70));
        System.out.println("Centimeters: " + BasicLengthConversion.calcFeetAndInchesToCentimeters(5, 10));

        //MethodExercises.SecondsAndMinutes - Method Overloading
        System.out.println("-----SecondsAndMinutes-----");
        System.out.println("Time: " + SecondsAndMinutes.getDurationString(756L));
        System.out.println("Time: " + SecondsAndMinutes.getDurationString(39_823L));

        //MethodExercises.AreaCalculator - Method Overloading
        System.out.println("-----AreaCalculator-----");
        System.out.println("Area: " + AreaCalculator.area(5.0));
        System.out.println("Area: " + AreaCalculator.area(-1));
        System.out.println("Area: " + AreaCalculator.area(5.0, 4.0));
        System.out.println("Area: " + AreaCalculator.area(-1.0, 4.0));

        //MethodExercises.MinutesToYearsAndDays
        System.out.println("-----MinutesToYearsAndDays-----");
        MinutesToYearsAndDays.printYearsAndDays(525600);
        MinutesToYearsAndDays.printYearsAndDays(1051200);
        MinutesToYearsAndDays.printYearsAndDays(561600);

        //MethodExercises.IntEqualityPrinter
        System.out.println("-----IntEqualityPrinter-----");
        IntEqualityPrinter.printEqual(1, 1, 1);
        IntEqualityPrinter.printEqual(1, 1, 2);
        IntEqualityPrinter.printEqual(-1, -1, -1);
        IntEqualityPrinter.printEqual(1, 2, 3);

        //MethodExercises.PlayingCat
        System.out.println("-----PlayingCat-----");
        System.out.println("Playing: " + PlayingCat.isCatPlaying(true, 10));
        System.out.println("Playing: " + PlayingCat.isCatPlaying(false, 36));
        System.out.println("Playing: " + PlayingCat.isCatPlaying(false, 35));
    }
}