package day34_LocalDateTime_Wrapper;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str = "123";
        int num =Integer.parseInt(str);//aoutoboxing
        int numb = Integer.valueOf(str);//unboxing
        System.out.println(num+1);
        System.out.println(numb+2);

    }
}
