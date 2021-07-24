package day10_IfStatements;

public class CampusHours {
    public static void main(String[] args) {
        int time = 7;
        boolean campusOpen = time >=8 && time<=23;

        if(campusOpen){
            System.out.println("Open");
            //campusOpen = "Open";
        }else{
            System.out.println("Closed");
            //campusOpen = "Closed";
        }

    }

}
