package day08_ifStatments;

public class GradeReport2 {
    public static void main(String[] args) {

        int score = 95;

        boolean madeA = score >= 90 && score <= 100;
        boolean madeB = !madeA && score >= 80;
        boolean madeC =!madeA && !madeB && score >= 70;
        boolean madeD = !madeA && !madeB && !madeC && score >=60;

        if (madeA){
            System.out.println("exellent you made A");
        }
        if(madeB){
            System.out.println("Good job You made B");
        }
        if(madeC){
            System.out.println("fair you made C");
        }
    }
}
