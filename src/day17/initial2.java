package day17;
import java.util.Locale;
import  java.util.Scanner;

import java.util.Scanner;

public class initial2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter full name");
        String fullName = input.nextLine();
        String initials = fullName.toUpperCase().charAt(0)+"."+ fullName.toUpperCase().substring(fullName.indexOf(" ")+1,fullName.indexOf(" ")+2 );
        System.out.println("initials = " + initials);
    }

}
