package day20_loop;
import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int results = 0;
        
        for (int i =0 ;i == 0;){
            System.out.println("enter number");
            int n = input.nextInt();
            if(n<0){
                break;
            }
            results +=n;
        }
        System.out.println("results = " + results);
        
    }
}
