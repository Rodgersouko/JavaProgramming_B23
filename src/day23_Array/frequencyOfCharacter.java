package day23_Array;
import java.util.Scanner;
public class frequencyOfCharacter {
    public static void main(String[] args) {


        String str = "aabcccd";

        Character ch = 'c';

        int count = 0;

        for(int i = 0; i <str.length(); i++){
            Character each = str.charAt(i);

            if(each == ch){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("----------------------");

        String removeDp = "";

        for(int i = 0; i <str.length(); i++){
            Character each = str.charAt(i);

            if(removeDp.contains(""+each)){
                continue;
            }
            removeDp += each;
        }
        System.out.println(removeDp);

    }
}
