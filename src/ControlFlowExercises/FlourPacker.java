package ControlFlowExercises;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        } else {
            int bigPack = bigCount * 5;
            return (bigPack + smallCount >= goal) && (smallCount >= goal % 5);
        }
    }
}
