package day26_multiDimetionalArray;

import java.util.Arrays;

public class MaximuAndMinimum {
    public static void main(String[] args) {
        int[][]  numbers ={{10,20,30,100},{40,80,50,60}};

        int max = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(max < numbers[i][i]){
                    max = numbers[i][i];



                }

            }
            System.out.println(max);
            //System.out.println(Arrays.deepToString(numbers[i][i]));
        }
    }
}
