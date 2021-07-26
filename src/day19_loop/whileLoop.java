package day19_loop;
import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number  = "";
        while(!number.equals("quit")){
            number  = input.next().toLowerCase();
            System.out.println("Number" + number);
            if(number.equals("quit")){
                break;
            }

        }
        }

}
