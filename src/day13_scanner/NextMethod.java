package day13_scanner;
import java.util.Scanner;

public class NextMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name = input.next();
        String comment ="";

        System.out.println("Are you a male");
        boolean isMale = input.nextBoolean();
        if(isMale){
            comment= "Welcome";
        }else{
            comment="Not allowed";
        }
        System.out.println(name +" "+ comment);
    }
}
