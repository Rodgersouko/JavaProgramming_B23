package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class dateTimeFormating {
    public static void main(String[] args) {
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("EEEE dd/MMMM/yyyy ");
        LocalDate today = LocalDate.now();

        System.out.println(today);

        System.out.println(today.format(DF));
        System.out.println("****************************");
        LocalTime time = LocalTime.now();
        System.out.println(time);
        DateTimeFormatter DT = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(time.format(DT));
    }
}
//MM/dd/yyyy hh:mm a
//name of day: EEEE
//months : MM MMM MMMM

//local time
// hour: hh
// minutes:: mm
// seconds: ss
// AM or PM a