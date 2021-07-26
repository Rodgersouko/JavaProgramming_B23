package day10_IfStatements;

public class NumberOfmonth {
    public static void main(String[] args) {
        int number = 1; //1-12
        String name ="";

        if(number ==1 ){
            //System.out.println("Jan");
            name = "Jan";
        }else if(number == 2){
            //System.out.println("Feb");
            name = "Feb";
        }else if(number == 3){
        //System.out.println("March");
            name = "March";
        }else if(number == 4){
            //System.out.println("April");
            name = "April";
        }else if(number == 5){
            //System.out.println("May");
            name = "May";
        }else if(number == 6){
            //System.out.println("June");
            name = "June";
        }else if(number == 7){
            //System.out.println("July");
            name = "JUly";
        }else if(number == 8){
            //System.out.println("Agust");
            name = "Agust";
        }else if(number == 9){
            //System.out.println("October");
            name = "Sept";
        }else if(number == 10){
            //System.out.println("November");
            name = "Oct";
        }else if(number == 11){
            //System.out.println("December");
            name = "Nov";
        }else{
            name = "Dec";
        }
        System.out.println(name);
    }
}
