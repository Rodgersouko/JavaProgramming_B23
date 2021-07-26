package day31_warmUpTask;

import java.util.Arrays;

public class warmUpTask {

    public static void main(String[] args) {
        String str = "aabbcc";
        System.out.println();
        String r=removeDup(str);
        System.out.println(r);

        String str1 = "heart";
        String str2= "earth";
        System.out.println(isAnigram(str1,str2));

    }

    public static String removeDup(String str) {
        String results ="";
        for (char i = 0; i < str.toCharArray().length; i++) {
            if (!results.contains(""+i)){
                results +=i;

            }

        }

        return results;

    }
    public  static boolean isAnigram(String str1,String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str1.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
         return  Arrays.equals(ch1,ch2);

    }
}
