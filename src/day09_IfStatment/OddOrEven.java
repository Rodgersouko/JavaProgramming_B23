package day09_IfStatment;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 100;
        boolean odd = number%2 !=0;
       //if(number%2 != 0){
        if(odd){
            System.out.println("odd");

        }else {
            System.out.println("even");
        }
    }
}
