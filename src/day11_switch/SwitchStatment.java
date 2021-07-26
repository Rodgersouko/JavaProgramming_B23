package day11_switch;
import java.util.Scanner;
public class SwitchStatment {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter no of the day");
        int number  = input.nextInt();
        //int number = 6;

        switch (number){

            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            default:
                System.out.println("invalid");
                break;

        }

    }
}
