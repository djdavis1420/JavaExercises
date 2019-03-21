package MethodExercises;

public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static String getDurationString(long minutes, long seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        } else {
            long totalHours = minutes / 60;
            long remMinutes = minutes % 60;

            String hoursString = totalHours + "h ";
            if (totalHours < 10) {
                hoursString = "0" + hoursString;
            }
            String minutesString = remMinutes + "m ";
            if (remMinutes < 10) {
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }

            return hoursString + minutesString + secondsString;
        }
    }

    public static String getDurationString(long seconds) {

        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        } else {
            long totalMinutes = seconds / 60;
            long remSeconds = seconds % 60;
            return getDurationString(totalMinutes, remSeconds);
        }
    }
}
