package day34_LocalDateTime_Wrapper;
import  java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalTime brake = now.plusMinutes(15);
        System.out.println(brake);
        LocalTime quiz = brake.plusMinutes(20);
        System.out.println(quiz);

    }
}
