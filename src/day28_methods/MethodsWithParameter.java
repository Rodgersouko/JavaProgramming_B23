package day28_methods;

public class MethodsWithParameter {
    public static void main(String[] args) {
        eligible(19);

    }
    public static void eligible(int age){
        if (age >=21){

            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }
    }
}
