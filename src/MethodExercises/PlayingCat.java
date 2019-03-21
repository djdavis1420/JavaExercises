package MethodExercises;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean summerPlaying = ((summer) && (25 <= temperature && temperature <= 45));
        boolean otherPlaying = ((!summer) && (25 <= temperature && temperature <= 35));
        return (summerPlaying || otherPlaying);
    }
}
