package day20_loop;

public class BranchingStatments {
    public static void main(String[] args) {
        for(int i =0; i <= 5; i++){

            if(i == 3){
                //break;
                continue;
            }
            System.out.println(i);
        }
        System.out.println("--------------");
        for(int i =1; i <= 100; i++){

            if(i%3 == 0 && i%5 == 0){
                System.out.println(i+" ");
            }else {
                continue;
            }

        }

    }


}
