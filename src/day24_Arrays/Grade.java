package day24_Arrays;

import java.lang.reflect.Array;

public class Grade {
    public static void main(String[] args) {
        String[] names = {"ann","nancy","sarah"};
        int[] scores = {90,75,80};
        char[] grades = new char[names.length];

        for(int i = 0 ; i < grades.length ;i++){
           // System.out.println(grades[i]);
            for(int j = 0 ; j < names.length ;i++){

                System.out.println(grades[j]);
            }
        }

        //if(scores[0] >= 90){
        //   grades[0] = 'A';
        //}

    }
}
