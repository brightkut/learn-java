package date_time;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        //manage date and time have 3 class recommend
        //1. Local Date have only YY-MM-DD
        //2. Local Time have time HH-MM-SS-NanoSecond
        //3. Local Date Time

        LocalDate ld = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2019, 12, 12);
        LocalDate ld3 = LocalDate.of(2020, Month.JULY, 12);
        System.out.println(ld);
        System.out.println(ld2);
        System.out.println(ld3);

        LocalTime lt;
        lt = LocalTime.now();
        System.out.println(lt);
        lt = LocalTime.of(10, 20, 30);
        System.out.println(lt);
        lt = LocalTime.of(10, 15);
        System.out.println(lt);

        LocalDateTime lcd;
        lcd = LocalDateTime.now();
        System.out.println(lcd);
        lcd = LocalDateTime.of(2012, 2, 1, 10, 15);
        System.out.println(lcd);

        //build in
        DayOfWeek dayOfWeek = lcd.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(lcd.getHour());
        System.out.println(lcd.getChronology());
        System.out.println(lcd.getMonth());
        System.out.println(lcd.getMonthValue());
        lcd = lcd.withHour(7);
        System.out.println(lcd);
    }
}
