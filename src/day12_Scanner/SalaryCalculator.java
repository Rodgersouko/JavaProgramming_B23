package day12_Scanner;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hourly rate");
        double hourlyRate = input.nextDouble();

        System.out.println("Hours a week");
        int weekly_hours = input.nextInt();

        System.out.println("weeks in a year");
        int weeks_a_year = input.nextInt();

        double salary = hourlyRate* weekly_hours* weeks_a_year;

        System.out.println("hourlyRate = " + hourlyRate);
        System.out.println("weekly_hours = " + weekly_hours);
        System.out.println("salary = $" +
                salary);
    }

}
/*
salary
hrs worked in a week
weeks in a year
area of a circle
 */