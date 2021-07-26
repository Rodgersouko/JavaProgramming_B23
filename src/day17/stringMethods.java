package day17;

public class stringMethods {
    public static void main(String[] args) {
        String sentence = "my favorite programming language s are: c# , Java, javascript";
        boolean hasJava = sentence.contains("java");
        boolean hasJava1 = sentence.toLowerCase().contains("java");

        System.out.println("has java " + hasJava);
        System.out.println("has java " + hasJava1);

        System.out.println("-----------------------");
        String sentence2 = "Cybertek school is the best";
        boolean startsWithCybertek =  sentence2.toLowerCase().startsWith("cybertek");
        boolean endsWithCybertek =  sentence2.toLowerCase().endsWith("best");

        System.out.println("startsWithCybertek = " + startsWithCybertek);
        System.out.println("startsWithCybertek = " + endsWithCybertek);
    }
}
