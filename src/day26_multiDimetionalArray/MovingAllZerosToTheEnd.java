package day26_multiDimetionalArray;

import java.util.Arrays;

public class MovingAllZerosToTheEnd {
    public static void main(String[] args) {
        int[] array ={10,0,5,0,1,0};

        int[] results= new int[array.length];

        int i = 0;
        for (int each: array) {
            if(each != 0){
               results[i++] = each;

            }
        }

        System.out.println(Arrays.toString(results));
    }
}
