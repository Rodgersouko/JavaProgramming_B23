package day11_switch;

public class Ternary {
    public static void main(String[] args) {
        double salary = 90_000;
        int creditScore = 720;
        String results =(salary >= 6000 && creditScore >=500)?"approved":"denied";
        System.out.println(results);
    }
}
