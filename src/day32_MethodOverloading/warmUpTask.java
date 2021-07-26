package day32_MethodOverloading;

public class warmUpTask {
    public static void main(String[] args) {
        int r1 = sum(10,12);
        int r2 = sum(100,50,10);
        int r3 = sum(100,50,10,100);

        System.out.println("r1 sum= "+r1);
        System.out.println("r2 sum= "+r2);
        System.out.println("r3 sum= "+r3);

    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

}
