package ControlFlowExercises;

public class Sum3And5 {

    public static void Sum3And5() {

        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum = sum + i;
                count++;
                System.out.println(i + " is a valid number.");
            }
            if (count == 5) {
                System.out.println("Sum: " + sum);
                break;
            }
        }
    }
}
