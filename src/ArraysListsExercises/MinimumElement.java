package ArraysListsExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter an integer value.\n");

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int findMin(int[] array) {
        int[] originalArray = Arrays.copyOf(array, array.length);
        Arrays.sort(originalArray);
        return originalArray[0];
    }
}
