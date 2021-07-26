package day16_SubString;
import java.util.Scanner;
public class SubString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter to words");
        String word1 = input.next();
        String word2 = input.next();

        String results = word1.substring(0) + word2.substring(0);

        System.out.println(results);
        System.out.println("-----------------------");

        System.out.println("Enter a three letter word");
        String word = input.next();

        String result = "";
        if (word.length()==3){
            result =(word.charAt(1) == 'a')? "cool word": "okay word";
            System.out.println(result);
        }else{
            System.out.println("invalid");
        }

    }
}
