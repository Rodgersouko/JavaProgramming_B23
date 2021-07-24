package day7_shortHandRelation;

public class UnaryPractie {
    public static void main(String[] args) {
        int a = 100;
        int b = -a++ + ++a - a-- * a-- % 2;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
    }
}
