package day22_recap;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        String correctName = "cybertek";
        String correctPawd = "cybertek123";

        Scanner input = new Scanner(System.in);
        System.out.println("enter user name");
        String name = input.next();
        System.out.println("enter user password");
        String password = input.next();
        if (name.equals(correctName) && password.equals(correctPawd)) {
            System.out.println("Login successfull");

        } else {
            for (int i = 1; i <= 3; i++) {
                System.out.println("username or password not correct");
                System.out.println("renter user name");
                name = input.next();
                System.out.println("renter user password");
                password = input.next();
                if (name.equals(correctName) && password.equals(correctPawd)) {
                    System.out.println("Login successfull");

                }else{
                    System.out.println("account locked");
                }
                break;
            }
        }
    }
}
