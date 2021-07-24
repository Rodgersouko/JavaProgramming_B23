package day08_ifStatments;

public class logicalOperators {
    public static void main(String[] args) {
        //int score = 80;
       // boolean passed = score >=60;
       // boolean failed = !passed;

        //System.out.println(passed);
        //System.out.println(-------------------);

        int score = 5;
        boolean passed = score >= 60;

        if(passed){
            System.out.println("Congrats");
        }

        if(!passed){
            System.out.println("you failed");
        }

        System.out.println("-----------------");

        int number = -01;

        boolean positive = number > 0;
        boolean negative = number < 0;
        boolean zero = !positive && !negative;

        if(positive){
            System.out.println(number+" is positive");
        }
        if(negative){
            System.out.println(number+ " is negative");
        }

        if(zero){
            System.out.println(number+ " is zero");
        }
        System.out.println ( 10.0/3 );
    }
}
