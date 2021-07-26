package day13_scanner;

import java.util.Scanner;

public class MilesTokilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Miles");
        double miles = input.nextDouble();
        double kilometer = miles/100;

        System.out.println("kilometer = " + kilometer);
    }
}
