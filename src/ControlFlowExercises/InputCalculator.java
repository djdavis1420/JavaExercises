package ControlFlowExercises;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        int sum = 0;
        int count = 0;

        while (running) {

            System.out.println("Enter a Number:");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                count++;
                int number = scanner.nextInt();
                sum = sum + number;
            } else {
                running = false;
            }

            scanner.nextLine();
        }

        double avg = (double) sum / (double) count;
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();

    }

}
