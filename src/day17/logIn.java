package day17;
import java.util.Locale;
import  java.util.Scanner;
public class logIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //database
        String correctUsername = "Cybertek@gmail.com";
        String correctPassword = "Cybertek123";

        System.out.println("Enter username");
        String username = input.nextLine();

        System.out.println("Enter password");
        String password = input.nextLine();

        boolean canLogin = username.equalsIgnoreCase(correctUsername)
                && username.contains("@gmail.com")
                && password.equals(correctPassword);
        if(canLogin){
            System.out.println("successfully logged in");
        }else{
            System.out.println("invalid username or password");
        }

    }
}
