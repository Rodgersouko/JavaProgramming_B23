package day18_Recap;

public class firstAndLast {

    public static void main(String[] args) {
        String first = "one";
        String second ="two";

        if(first.charAt(first.length() -1 ) == second.charAt(0)){
            System.out.println(first+ second.substring(1));
        }else{
            System.out.println(first + second);
        }
    }
}
