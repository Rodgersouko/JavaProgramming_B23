package day33_Methods;

import java.util.Arrays;

public class WarmUpTask1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        numbers=reverse(numbers);
        System.out.println(Arrays.toString(numbers));


    }

    public static int[] reverse(int[] array) {//{1,2,3,4,5}
        int[] results = new int[array.length];//{5,4,3,2,1}
        for (int i = array.length-1,j=0; i < 0 ; i-- ,j++) {
           results[j] =array[i];
        }
        return results;
    }

    public static String[] reverse(String[] array) {//{1,2,3,4,5}
        String[] results = new String[array.length];//{5,4,3,2,1}
        for (int i = array.length-1,j=0; i < 0 ; i-- ,j++) {
            results[j] =array[i];
        }
        return results;
    }

    public static double[] reverse(double[] array) {//{1,2,3,4,5}
        double[] results = new double[array.length];//{5,4,3,2,1}
        for (int i = array.length-1,j=0; i < 0 ; i-- ,j++) {
            results[j] =array[i];
        }
        return results;
    }

    public static char[] reverse(char[] array) {//{1,2,3,4,5}
        char[] results = new char[array.length];//{5,4,3,2,1}
        for (int i = array.length-1,j=0; i < 0 ; i-- ,j++) {
            results[j] =array[i];
        }
        return results;
    }

}
