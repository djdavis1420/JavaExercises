package ControlFlowExercises;

public class NumberToWords {

    public static void numberToWords(int number) {

        if (number == 0) {
            System.out.println("Zero");
        } else if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversedNumber = reverse(number);
            int zeroesToAdd = getDigitCount(number) - getDigitCount(reversedNumber);
            int digit;
            while (reversedNumber > 0) {
                digit = reversedNumber % 10;
                switch (digit) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Zero");
                        break;
                }
                reversedNumber /= 10;
            }

            for (int i = 0; i < zeroesToAdd; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int numberToReverse) {

        int reversedNumber = 0;

        while (Math.abs(numberToReverse) > 0) {
            reversedNumber *= 10;
            int digit = numberToReverse % 10;
            reversedNumber += digit;
            numberToReverse /= 10;
        }

        return reversedNumber;

    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        } else {
            int digitCount = 0;

            if (number == 0) {
                digitCount = 1;
            } else {
                while (number > 0) {
                    digitCount += 1;
                    number /= 10;
                }
            }
            return digitCount;
        }
    }
}
