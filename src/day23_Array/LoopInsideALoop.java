package day23_Array;

public class LoopInsideALoop {
    public static void main(String[] args) {

        for(int i = 1; i <=5; i++){
            for (int j =1 ; j <= 20; j++){
               // System.out.print(i + " ");
               // System.out.print(j + " ");
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");
        for(int i = 1; i <=5; i++){
            for (int j =1 ; j <= i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
