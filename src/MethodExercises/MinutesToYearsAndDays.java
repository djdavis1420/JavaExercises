package MethodExercises;

public class MinutesToYearsAndDays {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long totalYears = minutes / (365*24*60);
            long remMinutes = minutes % (365*24*60);
            long totalDays = remMinutes / (24*60);

            System.out.println(minutes + " min = " + totalYears + " y and " + totalDays + " d");
        }
    }
}
