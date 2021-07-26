package day7_shortHandRelation;

public class EligibleForLoan {
    public static void main(String[] args) {
        String name ="Randy";
        int age=18;
        int workHistory= 7;
        int creditScore= 760;
        double income=45000;
        //and logic &&
        //or logic ||
        boolean isEligible = age>=18 && workHistory>=2 && creditScore >=700 && income>=60000;//and logic(all conditions to be met)
        System.out.println(name +" "+"is Eligible = " + isEligible);

        boolean isEligiblee = age>=18 || workHistory>=2 || creditScore >=700 || income>=60000;//or logic(just one condition to be met)

        System.out.println(name +" "+"is Eligible = " + isEligiblee);
    }
}
