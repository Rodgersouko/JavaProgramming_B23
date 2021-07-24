package day7_shortHandRelation;

public class swipeTwoNumbers {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = a;

        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
