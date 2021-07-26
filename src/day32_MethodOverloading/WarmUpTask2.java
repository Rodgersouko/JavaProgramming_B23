package day32_MethodOverloading;

import java.util.Arrays;

public class WarmUpTask2 {
    public static void main(String[] args) {
//        int[] array ={1,2,3,4,5,6,7,8,9};
//        int number = 10;
        double[] array ={1.5,2.5,3.5};
        double number= 4.7;
        array= addElement(array,number);
        System.out.println(Arrays.toString(array));
        //number=11;
        number = 6.9;
        array =addElement(array,number);
        System.out.println(Arrays.toString(array));



    }
    public static int[] addElement(int[] array,int number){
      int[] result = Arrays.copyOf(array,array.length+1) ;
      result[result.length-1]=number;

      return result;
    }
    public static double[] addElement(double[] array,double number){
        double[] result = Arrays.copyOf(array,array.length+1);
        result[result.length-1]=number;

        return result;
    }

}
