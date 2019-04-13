import ClassExercises.*;
import ControlFlowExercises.InputCalculator;
import MethodExercises.PaintJob;

public class Main {

    public static void main(String[] args) {

//        // CLASSES
//        // ClassExercises.SimpleCalculator
//        System.out.println("-----ClassExercises.SimpleCalculator-----");
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());
//
//        // ClassExercises.Person
//        System.out.println("-----ClassExercises.Person-----");
//        Person person = new Person();
//        person.setFirstName("");
//        person.setLastName("");
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");
//        System.out.println("fullName= " + person.getFullName());
//
//        // ClassExercises.BankAccount
//        System.out.println("-----ClassExercises.BankAccount-----");
//        BankAccount johnSmith = new BankAccount(123456789, 500, "John Smith", "john@smith.com", "555-555-5555");
//        johnSmith.depositFunds(100);
//        johnSmith.withdrawFunds(250);
//        BankAccount jennySmith = new BankAccount(987654321, 250, "Jenny Smith", "555-867-5309");
//        jennySmith.depositFunds(250);
//        jennySmith.depositFunds(250);
//        jennySmith.depositFunds(250);
//        jennySmith.withdrawFunds(300);
//        System.out.println("Jenny's Phone Number is " + jennySmith.getCustomerPhone());
//        BankAccount newAccount = new BankAccount();
//        System.out.println(newAccount.getCustomerName());
//
//        // ClassExercises.VIPCustomer
//        System.out.println("-----ClassExercises.VIPCustomer-----");
//        VIPCustomer person1 = new VIPCustomer();
//        System.out.println(person1.getName() + " has a credit limit of $" + person1.getCreditLimit() + ".");
//        System.out.println(person1.getName() + " can be reached at " + person1.getEmail() + ".");
//        VIPCustomer person2 = new VIPCustomer("John Smith", 25000);
//        System.out.println(person2.getName() + " has a credit limit of $" + person2.getCreditLimit() + ".");
//        System.out.println(person2.getName() + " can be reached at " + person2.getEmail() + ".");
//        VIPCustomer person3 = new VIPCustomer("Jenny Smith", 50000, "jenny@smith.com");
//        System.out.println(person3.getName() + " has a credit limit of $" + person3.getCreditLimit() + ".");
//        System.out.println(person3.getName() + " can be reached at " + person3.getEmail() + ".");
//
//        // ClassExercises.Wall
//        System.out.println("-----ClassExercises.Wall-----");
//        Wall wall = new Wall(5,4);
//        System.out.println("area= " + wall.getArea());
//        wall.setHeight(-1.5);
//        System.out.println("width= " + wall.getWidth());
//        System.out.println("height= " + wall.getHeight());
//        System.out.println("area= " + wall.getArea());
//
//        // ClassExercises.Point
//        System.out.println("-----ClassExercise.Point-----");
//        Point first = new Point(6,5);
//        Point second = new Point(3,1);
//        System.out.println("distance(0,0)= " + first.distance());
//        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2,2));
//        Point point = new Point();
//        System.out.println("distance() = " + point.distance());
//
//        // ClassExercises.CarpetCostCalculator
//        System.out.println("-----ClassExercise.CarpetCostCalculator-----");
//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//
//        // ClassExercises.ComplexOperations
//        System.out.println("-----ClassExercises.ComplexOperations-----");
//        ComplexNumber one = new ComplexNumber(1.0, 1.0);
//        ComplexNumber number = new ComplexNumber(2.5, -1.5);
//        one.add(1,1);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        one.subtract(number);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        number.subtract(one);
//        System.out.println("number.real= " + number.getReal());
//        System.out.println("number.imaginary= " + number.getImaginary());
//
//        // ClassExercises.CircleCylinder
//        System.out.println("-----ClassExercises.CircleCylinder-----");
//        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius= " + circle.getRadius());
//        System.out.println("circle.area= " + circle.getArea());
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//        System.out.println("cylinder.area= " + cylinder.getArea());
//        System.out.println("cylinder.volume= " + cylinder.getVolume());
//
//        // ClassExercises.PoolArea
//        System.out.println("-----ClassExercises.PoolArea-----");
//        Rectangle rectangle = new Rectangle(5, 10);
//        System.out.println("rectangle.width= " + rectangle.getWidth());
//        System.out.println("rectangle.length= " + rectangle.getLength());
//        System.out.println("rectangle.area= " + rectangle.getArea());
//        Cuboid cuboid = new Cuboid(5, 10, 5);
//        System.out.println("cuboid.width= " + cuboid.getWidth());
//        System.out.println("cuboid.length= " + cuboid.getLength());
//        System.out.println("cuboid.area= " + cuboid.getArea());
//        System.out.println("cuboid.height= " + cuboid.getHeight());
//        System.out.println("cuboid.volume= " + cuboid.getVolume());
//
//        // ClassExercises.BurgerStore
//        System.out.println("-----ClassExercises.BurgerStore-----");
//        StandardBurger standardBurger = new StandardBurger("standard burger", "standard bun", "beef", 4.99);
//        standardBurger.setTopping1("lettuce", 0.75);
//        standardBurger.setTopping2("tomato", 0.75);
//        standardBurger.setTopping3("cheese", 1.25);
//        System.out.println("Total price: $" + standardBurger.itemizeBurger());
//        HealthyBurger healthyBurger = new HealthyBurger("boca beef", 6.99);
//        healthyBurger.setHealthyTopping1("egg", 0.75);
//        healthyBurger.setHealthyTopping2("peanut butter", 1.25);
//        System.out.println("Total price: $" + healthyBurger.itemizeBurger());
//        DeluxeBurger deluxeBurger = new DeluxeBurger();
//        System.out.println("Total price: $" + deluxeBurger.itemizeBurger());

//        // CONTROL FLOW
//        // ControlFlowExercises.DayOfTheWeek
//        System.out.println("-----ControlFlowExercises.DayOfTheWeek-----");
//        DayOfTheWeek.printDayOfTheWeek(3);
//        DayOfTheWeek.printDayOfTheWeek(6);
//        DayOfTheWeek.printDayOfTheWeek(9);
//
//        // ControlFlowExercises.NumberInWord
//        System.out.println("-----ControlFlowExercises.NumberInWord-----");
//        NumberInWord.printNumberInWord(0);
//        NumberInWord.printNumberInWord(4);
//        NumberInWord.printNumberInWord(8);
//        NumberInWord.printNumberInWord(12);
//
//        // ControlFlowExercises.NumberOfDaysInMonth
//        System.out.println("-----ControlFlowExercises.NumberOfDaysInMonth-----");
//        System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
//        System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
//        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
//        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));
//
//        // ControlFlowExercises.Sum3And5
//        System.out.println("-----ControlFlowExercises.Sum3And5-----");
//        Sum3And5.Sum3And5();
//
//        // ControlFlowExercises.SumOddRange
//        System.out.println("-----ControlFlowExercises.SumOddRange-----");
//        System.out.println(SumOddRange.sumOdd(1, 100));
//        System.out.println(SumOddRange.sumOdd(-1, 100));
//        System.out.println(SumOddRange.sumOdd(100, 100));
//        System.out.println(SumOddRange.sumOdd(13, 13));
//        System.out.println(SumOddRange.sumOdd(100, -100));
//        System.out.println(SumOddRange.sumOdd(100, 1000));
//
//        // ControlFlowExercises.DigitSum
//        System.out.println("-----ControlFlowExercises.DigitSum-----");
//        System.out.println("Sum of Digits: " + DigitSum.sumDigits(125));
//        System.out.println("Sum of Digits: " + DigitSum.sumDigits(369));
//        System.out.println("Sum of Digits: " + DigitSum.sumDigits(4725));
//        System.out.println("Sum of Digits: " + DigitSum.sumDigits(-125));
//        System.out.println("Sum of Digits: " + DigitSum.sumDigits(5));
//
//        // ControlFlowExercises.NumberPalindrome
//        System.out.println("-----ControlFlowExercises.NumberPalindrome-----");
//        System.out.println(NumberPalindrome.isPalindrome(-1221));
//        System.out.println(NumberPalindrome.isPalindrome(707));
//        System.out.println(NumberPalindrome.isPalindrome(11212));
//
//        // ControlFlowExercises.FirstLastDigitSum
//        System.out.println("-----ControlFlowExercises.FirstLastDigitSum-----");
//        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(252));
//        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(257));
//        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(0));
//        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(5));
//        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(-10));
//
//        // ControlFlowExercises.EvenDigitSum
//        System.out.println("-----ControlFlowExercises.EvenDigitSum-----");
//        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
//        System.out.println(EvenDigitSum.getEvenDigitSum(252));
//        System.out.println(EvenDigitSum.getEvenDigitSum(-22));
//
//        // ControlFlowExercises.SharedDigit
//        System.out.println("-----ControlFlowExercises.SharedDigit-----");
//        System.out.println(SharedDigit.hasSharedDigit(12, 23));
//        System.out.println(SharedDigit.hasSharedDigit(9, 99));
//        System.out.println(SharedDigit.hasSharedDigit(15, 55));
//        System.out.println(SharedDigit.hasSharedDigit(35, 73));
//
//        // ControlFlowExercises.LastDigitChecker
//        System.out.println("-----ControlFlowExercises.LastDigitChecker-----");
//        System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71));
//        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42));
//        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999));
//
//        // ControlFlowExercises.GreatestCommonDivisor
//        System.out.println("-----ControlFlowExercises.GreatestCommonDivisor-----");
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25, 15));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
//        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
//
//        // ControlFlowExercises.FactorPrinter
//        System.out.println("-----ControlFlowExercises.FactorPrinter-----");
//        FactorPrinter.printFactors(6);
//        FactorPrinter.printFactors(32);
//        FactorPrinter.printFactors(10);
//        FactorPrinter.printFactors(-1);
//
//        // ControlFlowExercises.PerfectNumber
//        System.out.println("-----ControlFlowExercises.PerfectNumber-----");
//        System.out.println(PerfectNumber.isPerfectNumber(6));
//        System.out.println(PerfectNumber.isPerfectNumber(28));
//        System.out.println(PerfectNumber.isPerfectNumber(5));
//        System.out.println(PerfectNumber.isPerfectNumber(-1));
//
//        // ControlFlowExercises.NumberToWords
//        System.out.println("-----ControlFlowExercises.NumberToWords-----");
//        System.out.println(NumberToWords.getDigitCount(0));
//        System.out.println(NumberToWords.getDigitCount(123));
//        System.out.println(NumberToWords.getDigitCount(-12));
//        System.out.println(NumberToWords.getDigitCount(5200));
//        System.out.println(NumberToWords.reverse(-121));
//        System.out.println(NumberToWords.reverse(1212));
//        System.out.println(NumberToWords.reverse(1234));
//        System.out.println(NumberToWords.reverse(100));
//        NumberToWords.numberToWords(123);
//        NumberToWords.numberToWords(1010);
//        NumberToWords.numberToWords(1000);
//        NumberToWords.numberToWords(-12);
//
//        // ControlFlowExercises.FlourPacker
//        System.out.println("-----ControlFlowExercises.FlourPacker-----");
//        System.out.println(FlourPacker.canPack(1, 0, 4));
//        System.out.println(FlourPacker.canPack(1, 0, 5));
//        System.out.println(FlourPacker.canPack(0, 5, 4));
//        System.out.println(FlourPacker.canPack(2, 2, 11));
//        System.out.println(FlourPacker.canPack(-3, 2, 12));
//
//        // ControlFlowExercises.LargestPrime
//        System.out.println("-----ControlFlowExercises.LargestPrime-----");
//        System.out.println(LargestPrime.getLargestPrime(21));
//        System.out.println(LargestPrime.getLargestPrime(217));
//        System.out.println(LargestPrime.getLargestPrime(0));
//        System.out.println(LargestPrime.getLargestPrime(45));
//        System.out.println(LargestPrime.getLargestPrime(-1));
//
//        // ControlFlowExercises.InputCalculator
//        System.out.println("-----ControlFlowExercises.InputCalculator-----");
//        InputCalculator.inputThenPrintSumAndAverage();

//        // BASIC METHODS
//        // MethodExercises.PositiveNegativeZero
//        System.out.println("-----MethodExercises.PositiveNegativeZero-----");
//        PositiveNegativeZero.checkNumber(42);
//        PositiveNegativeZero.checkNumber(-42);
//        PositiveNegativeZero.checkNumber(0);
//
//        // MethodExercises.SpeedConverter
//        System.out.println("-----MethodExercises.SpeedConverter-----");
//        System.out.println("Miles = " + SpeedConverter.toMilesPerHour(1.5));
//        System.out.println("Miles = " + SpeedConverter.toMilesPerHour(10.25));
//        System.out.println("Miles = " + SpeedConverter.toMilesPerHour(-5.6));
//        System.out.println("Miles = " + SpeedConverter.toMilesPerHour(25.42));
//        System.out.println("Miles = " + SpeedConverter.toMilesPerHour(75.114));
//        SpeedConverter.printConversion(1.5);
//        SpeedConverter.printConversion(10.25);
//        SpeedConverter.printConversion(-1);
//        SpeedConverter.printConversion(25.42);
//        SpeedConverter.printConversion(75.114);
//
//        // MethodExercises.MegaBytesConverter
//        System.out.println("-----MethodExercises.MegaBytesConverter-----");
//        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
//
//        // MethodExercises.BarkingDog
//        System.out.println("-----MethodExercises.BarkingDog-----");
//        System.out.println("Wake Up: " + BarkingDog.shouldWakeUp(true, 1));
//        System.out.println("Wake Up: " + BarkingDog.shouldWakeUp(false, 2));
//        System.out.println("Wake Up: " + BarkingDog.shouldWakeUp(true, 8));
//        System.out.println("Wake Up: " + BarkingDog.shouldWakeUp(true, -1));
//
//        // MethodExercises.LeapYear
//        System.out.println("-----MethodExercises.LeapYear-----");
//        System.out.println("Leap Year: " + LeapYear.isLeapYear(-1600));
//        System.out.println("Leap Year: " + LeapYear.isLeapYear(1600));
//        System.out.println("Leap Year: " + LeapYear.isLeapYear(2017));
//        System.out.println("Leap Year: " + LeapYear.isLeapYear(2000));
//
//        // MethodExercises.DecimalComparator
//        System.out.println("-----MethodExercises.DecimalComparator-----");
//        System.out.println("Equals: " + DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        System.out.println("Equals: " + DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
//        System.out.println("Equals: " + DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
//        System.out.println("Equals: " + DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
//
//        // MethodExercises.EqualSumChecker
//        System.out.println("-----MethodExercises.EqualSumChecker-----");
//        System.out.println("EqualSum: " + EqualSumChecker.hasEqualSum(1, 1, 1));
//        System.out.println("EqualSum: " + EqualSumChecker.hasEqualSum(1, 1, 2));
//        System.out.println("EqualSum: " + EqualSumChecker.hasEqualSum(1, -1, 0));
//
//        // MethodExercises.TeenNumberChecker
//        System.out.println("-----MethodExercises.TeenNumberChecker-----");
//        System.out.println("HasTeen: " + TeenNumberChecker.hasTeen(9, 99, 19));
//        System.out.println("HasTeen: " + TeenNumberChecker.hasTeen(23, 15, 42));
//        System.out.println("HasTeen: " + TeenNumberChecker.hasTeen(22, 23, 34));
//
//        // MethodExercises.BasicLengthConversion - Method Overloading
//        System.out.println("-----MethodExercises.BasicLengthConversion-----");
//        System.out.println("Centimeters: " + BasicLengthConversion.calcFeetAndInchesToCentimeters(70));
//        System.out.println("Centimeters: " + BasicLengthConversion.calcFeetAndInchesToCentimeters(5, 10));
//
//        // MethodExercises.SecondsAndMinutes - Method Overloading
//        System.out.println("-----MethodExercises.SecondsAndMinutes-----");
//        System.out.println("Time: " + SecondsAndMinutes.getDurationString(756L));
//        System.out.println("Time: " + SecondsAndMinutes.getDurationString(39_823L));
//
//        // MethodExercises.AreaCalculator - Method Overloading
//        System.out.println("-----MethodExercises.AreaCalculator-----");
//        System.out.println("Area: " + AreaCalculator.area(5.0));
//        System.out.println("Area: " + AreaCalculator.area(-1));
//        System.out.println("Area: " + AreaCalculator.area(5.0, 4.0));
//        System.out.println("Area: " + AreaCalculator.area(-1.0, 4.0));
//
//        // MethodExercises.MinutesToYearsAndDays
//        System.out.println("-----MethodExercises.MinutesToYearsAndDays-----");
//        MinutesToYearsAndDays.printYearsAndDays(525600);
//        MinutesToYearsAndDays.printYearsAndDays(1051200);
//        MinutesToYearsAndDays.printYearsAndDays(561600);
//
//        // MethodExercises.IntEqualityPrinter
//        System.out.println("-----MethodExercises.IntEqualityPrinter-----");
//        IntEqualityPrinter.printEqual(1, 1, 1);
//        IntEqualityPrinter.printEqual(1, 1, 2);
//        IntEqualityPrinter.printEqual(-1, -1, -1);
//        IntEqualityPrinter.printEqual(1, 2, 3);
//
//        // MethodExercises.PlayingCat
//        System.out.println("-----MethodExercises.PlayingCat-----");
//        System.out.println("Playing: " + PlayingCat.isCatPlaying(true, 10));
//        System.out.println("Playing: " + PlayingCat.isCatPlaying(false, 36));
//        System.out.println("Playing: " + PlayingCat.isCatPlaying(false, 35));
//
//        // MethodExercises.PaintJob
//        System.out.println("-----MethodExercises.PaintJob-----");
//        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
//        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
//        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
//        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5));
//        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5));
//        System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35));
//        System.out.println(PaintJob.getBucketCount(3.4, 1.5));
//        System.out.println(PaintJob.getBucketCount(6.26, 2.2));
//        System.out.println(PaintJob.getBucketCount(3.26, 0.75));

    }
}
