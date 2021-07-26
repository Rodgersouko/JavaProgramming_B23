package Day06_unaryOperators;

public class unaryOperators {
    public static void main(String[] args) {

        int a = 100;
        ++a;
        System.out.println("a = " + a);
        
        int b =100;
        --b;
        System.out.println("b = " + b);
        
        int n1 =50;
        int n2 =n1++;

        System.out.println("n2 = " + n2);
        System.out.println("n1 = " + n1);

        int a1= 100;
        int a2= ++a1;

        System.out.println("a2 = " + a2);
        System.out.println("a1 = " + a1);
        System.out.println( a2++);
        System.out.println("a2 = " + a2);


    }
    
    
    
}
