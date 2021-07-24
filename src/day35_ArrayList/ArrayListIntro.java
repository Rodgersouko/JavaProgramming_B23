package day35_ArrayList;

import java.util.ArrayList;
public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);//0
        numbers.add(0,20);//1
        numbers.add(30);//2
        numbers.set(1,90);
        System.out.println(numbers);
        System.out.println(numbers.get(1));
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("-------------------------");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        System.out.println(list1);
    }
}
//.set(2,25); replaces the element at the specified index
//.get();
//.remove(2); o removes the element at the specified index
//.remove("milk");