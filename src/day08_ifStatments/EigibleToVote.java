package day08_ifStatments;

public class EigibleToVote {
    public static void main(String[] args) {
        String name ="James";
        int age = 15;
        String citizen="USA";

        boolean eligibleToVote = age >= 21 &&  citizen
== "USA";
        if(eligibleToVote){
            System.out.println(name + " is eligible");
        }
        if(!eligibleToVote){
            System.out.println(name + " is not eligible");
        }
    }
}
