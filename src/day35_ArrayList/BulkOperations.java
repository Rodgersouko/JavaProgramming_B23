package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        //addAll(collection type);
        //removeAll(collection type);
        //retainAll(collection type);
        //containsAll(collection type);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20, 30, 40, 50));
        System.out.print(numbers);
    }

}
