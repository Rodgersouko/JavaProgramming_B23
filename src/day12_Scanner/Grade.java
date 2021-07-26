package day12_Scanner;
public class Grade {
    public static void main(String[] args) {
        char grade = 'A';
        String results ="";
switch (grade){
case 'A':  results="Exellent";
                break;
    default:
        throw new IllegalStateException("Unexpected value: " + grade);
}
    }
}
/*
b great job
c good
d passed
f failed
 */