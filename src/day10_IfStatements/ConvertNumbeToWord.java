package day10_IfStatements;

public class ConvertNumbeToWord {
    public static void main(String[] args) {
        int number= 0;
        String word="Invalid";
         int   say =1;

        if(number>=0 && number<=9){
            if(number==0){
                word="zero"; say = 1;
            }else if(number==1){
                word="one";
            }else if(number==2){
                word="two";
            }else if(number==3){
                word="three";
            }else if(number==4){
                word="four";
            }else if(number==5){
                word="five";
            }else if(number==6){
                word="six";
            }else if(number==7){
                word="seven";
            }else if(number==8){
                word="eight";
            }else if(number==9){
                word="nine";
            }else{
                word="invalid";
            }

        }
        System.out.println("word = " + word +" " +"say = " +say);
    }
}
