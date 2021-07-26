package day13_scanner;
import java.util.Scanner;

public class NextMethod1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Job title");
        String jobTitle = input.next();


        System.out.println("gender");
        String gender = input.next();

        System.out.println("jobTitle = " + jobTitle);
    }



}

