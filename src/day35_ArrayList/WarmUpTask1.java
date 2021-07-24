package day35_ArrayList;

import java.text.DateFormat;
import java.text.Format;
import java.time.LocalDate;
import java.util.Arrays;

public class WarmUpTask1 {
    public static void main(String[] args) {
        LocalDate[] dates = new LocalDate[10];
        //DateFormat df = LocalDate.of();
        for (int i = 0; i < dates.length; i++) {
            dates[i] = LocalDate.now().plusDays(i+1);
        }
        System.out.println(Arrays.toString(dates));
    }

}
