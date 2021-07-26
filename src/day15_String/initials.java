package day15_String;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("first name");
        String firstName = input.next();

        System.out.println("last name");
        String lastName = input.next();
        
        char f = firstName.charAt(0);
        char l = lastName.charAt(0);
        
        String initial = f+ "."+l;

        System.out.println("initial =" + initial);
    }
    
}
