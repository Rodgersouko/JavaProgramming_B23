package day23_Array;

import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        String[] months ={"jan","feb","march","april","may","june"};
                            //0   1       2       3       4      5
        System.out.println("enter number of month");
        int n = new Scanner(System.in).nextInt();
        System.out.println(months[n-1]);
    }
}
