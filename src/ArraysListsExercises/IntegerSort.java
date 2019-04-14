package ArraysListsExercises;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerSort {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter an integer value.\n");

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printIntegers(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " has a value of " + array[i] + ".");
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] originalArray = Arrays.copyOf(array, array.length);
        Arrays.sort(originalArray);
        int[] reverseArray = new int[originalArray.length];
        int j = 0;

        for(int i = originalArray.length - 1; i >= 0; i--) {
            reverseArray[j] = originalArray[i];
            j++;
        }

        return reverseArray;
    }
}
