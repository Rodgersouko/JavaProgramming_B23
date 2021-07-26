package day11_switch;

public class SwitchStatment2 {
    public static void main(String[] args) {
        String name = "chrome";

        switch (name){
            case "chrome":
                System.out.println("chrome is selected");
                break; //case closed

            case "firefox":
                System.out.println("firefox is selected");
                break;// case closed
            case "edge":
                System.out.println("edge");
                break;
            default:
                System.err.println("invalid browser name!!!");

        }
    }
}
