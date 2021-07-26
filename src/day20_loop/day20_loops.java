package day20_loop;

public class day20_loops {
    public static void main(String[] args) {
        String sentence = "cat dog dog cat";

        int numberOfCats=0;
        for(int i =0 ; i <= sentence.length()-3; i++){
          String each=  sentence.substring(i,i+3);
            if(each.equals("cat")){
                numberOfCats++;
            }
        }
        System.out.println("numberOfCats = " + numberOfCats);
    }
}
