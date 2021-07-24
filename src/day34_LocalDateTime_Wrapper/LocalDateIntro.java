package day34_LocalDateTime_Wrapper;
import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {
       LocalDate eid = LocalDate.of(2021,7,20);
        System.out.println(eid);
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate examWeek = today.plusDays(14);
        System.out.println(examWeek);
        examWeek = today.plusWeeks(2);
        System.out.println(examWeek);
        examWeek = today.plusMonths(1);
        System.out.println(examWeek);
        examWeek = today.plusYears(1);
        System.out.println(examWeek);

        /*
        of()
        now()
        isAfter()
        isEqual()
        IsLeapYear()
         */

        System.out.println("--------------------");
        String[] names = {"roja","ivy","evans"};
        LocalDate[] DoB = {LocalDate.of(1996,4,8),
                           LocalDate.of(1998,6,26),
                           LocalDate.of(1999,3,27)
        };
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+" "+DoB[i]);

        }
    }
}
