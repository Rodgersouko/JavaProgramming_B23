package day17;

import java.util.Locale;
import  java.util.Scanner;

public class initial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = input.next();
        System.out.println("Enter last name");
        String lastName = input.next();

        String initial = firstName.substring(0,1).toUpperCase() + "." + lastName.substring(0,1).toUpperCase();
        System.out.println(initial);

    }
}
