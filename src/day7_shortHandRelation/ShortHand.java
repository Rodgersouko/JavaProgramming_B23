package day7_shortHandRelation;

public class ShortHand {

    public static void main(String[] args) {
        String name1 = "Muhtar";
        String name2 = "Mehmet";

        String name3 = name2;


        name2 = name1;
        name1 = name3;

        System.out.println("name3 = " + name3);
        System.out.println("name2 = " + name2);
        System.out.println("name1 = " + name1);

        System.out.println("-----------------------");
        int balance = 300;
        balance += 200;

        System.out.println("balance = " + balance);
        System.out.println("-----------------------");
        String school = "Cybertek";
        school +="School";

        System.out.println("school = " + school);
    }


}
