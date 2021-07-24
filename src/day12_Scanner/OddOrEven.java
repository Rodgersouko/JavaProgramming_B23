package day12_Scanner;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter number");
        int number = input.nextInt();

        if(number%2 ==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }


}
/*
days in week
months in name

 */