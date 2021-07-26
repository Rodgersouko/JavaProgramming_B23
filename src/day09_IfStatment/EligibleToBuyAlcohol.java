package day09_IfStatment;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {
        int age = 19;
        boolean eligible = age >= 18;

        if (eligible) {
            System.out.println("Is eligible");
        } else {
            System.out.println("Not eligible");

        }
    }
}
