package day13_scanner;

import java.util.Scanner;

public class ScannerMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("You are full time employee");
        boolean isFulltime = input.nextBoolean();

        System.out.println("isFulltime = " + isFulltime);
    }

}
