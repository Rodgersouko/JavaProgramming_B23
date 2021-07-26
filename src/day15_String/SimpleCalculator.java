package day15_String;
import  java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter num1");
        double num1 = input.nextDouble();

        System.out.println("enter math operator");
        char mathOperator = input.next().charAt(0);

        System.out.println("enter num2");
        double num2 = input.nextDouble();

        double results = 0;

        switch (mathOperator){
            case '-': results = num1 - num2;
            break;
            case '+': results = num1 + num2;
            break;
            case '*': results = num1 * num2;
            break;
            case  '/':results = num1 / num2;
            break;

            default:
                System.out.println("invalid operator");

        }
        System.out.println("results = " + results);




    }
}
