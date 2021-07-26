package day18_Recap;
import java.util.Scanner;
public class WithotX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.next();

        if(word.startsWith("x")){
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);


        }

    }

}
