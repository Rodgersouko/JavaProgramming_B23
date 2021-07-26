
//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
//import java.util.stream.IntStream;

public class practice1 {
    public static void main(String[] args) {
        int num =8;
        System.out.println(--num + " ");
        System.out.println(num=6);
        System.out.println(num++ + " " + --num);

        System.out.println("-------------------------------------");
        byte b= 42-12/3*5;
        b+= -30;
        System.out.println(b);

        System.out.println("-------------------------------------");
        boolean a= ('Z' !='Z') && false;
        boolean c= a|| true;
        System.out.println(c);

        System.out.println("-------------------------------------");
        int[] a1=new int[5];
        System.out.println(Arrays.toString(a1));
        int[] b1= {1,2,3,4,5,6};
        a1=b1;

        for (int i =0; i <a1.length; i++){
            System.out.println(a1[i]);
        }
        System.out.println("--------------------------------------");
        String[] luckyNumber= {"one","two","three","four","five","six","seven"};
        int x= luckyNumber.length;
        int y= luckyNumber[6].length();

        System.out.println(x+y);
        System.out.println(x+" "+y);

    }
    }





