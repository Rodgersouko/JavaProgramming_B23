package day11_switch;

public class Calculator {

    public static void main(String[] args) {
        double n1 = 100;
        double n2 = 2.5;
        double results=0;
        char mathOperator = '-';
        switch (mathOperator){
            case '-':
                results = n1-n2;
        }
        System.out.println(results);
    }
}
