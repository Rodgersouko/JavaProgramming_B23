package day17;
import java.util.Scanner;
public class gmailRequirement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your email address");
        String email = input.next();

        if(email.toLowerCase().contains("@gmail.com")){
            System.out.println("validEmail " );
        }else{
            System.out.println("not valid email  ");
        }
    }
}
