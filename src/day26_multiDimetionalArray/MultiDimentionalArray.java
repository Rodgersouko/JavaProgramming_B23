package day26_multiDimetionalArray;

import java.util.Arrays;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        int[][] arr2D = {{1,2,3} ,{4,5}, {6,7,8} };
        //                  0,      1,      2
        System.out.println(arr2D.length);

        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[1][1]);
        System.out.println("-----------------------------------------");

        for (int i = 0; i < arr2D.length; i++) {
            int[] eachSArray = arr2D[i] ;
            for (int j = 0; j < eachSArray.length; j++) {
                System.out.print(eachSArray[j]+", ");
            }
            System.out.println();
        }

    }
}
