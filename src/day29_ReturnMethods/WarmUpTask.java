package day29_ReturnMethods;

import java.util.Arrays;

public class WarmUpTask {
    public static void main(String[] args) {
        posNegZero(10);
        System.out.println("-------------------------");
        int[] numbers = {10,20,0,-30,-5,20};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <0){
                System.out.println(numbers[i]);
                System.out.println();

            }
        }

    }

    public static void posNegZero(int number){
        if(number>=0){
            System.out.println("positive number");
        }else{
            System.out.println("negative number");
        }
        System.out.println(number);
    }
    public static void sortDce(int[] arr){
        Arrays.sort(arr);
    }
}
