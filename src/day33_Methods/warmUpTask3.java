package day33_Methods;

public class warmUpTask3 {


    public static int frequency(int[] array, int element) {
        int count = 0;

        for (double each : array) {
            if (each == element)
                count++;

        }
        return count;
    }

}

