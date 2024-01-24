package Lesson.L20_Day_Time;

// 1.Данный класс находиться в пакете java.time.format
// 2.С помощью метода format вы можете изменять вывод вашей даты или вашего времени на экран.
// 3.Методы класса DateTimeFormatter ofLocalizedDate, ofLocalizedTime, ofLocalizedDateTime должны создавать формат, который будет
//   применяться для соответствующих классов
// 4.Метод formatter не только у объектов классов LocalDate, LocalTime, LocalDateTime, но и у класса DateTimeFormatter, что делает возможным
//   написаниие последнего выражения в следующем виде: SOUT(formatter.format(ldt)); И эти 2 выражения имеют один и тот же результат
// 5.С помощью метода ofPattern вы можете создавать свой формат.\
// 6.LocalDateTime ldt=LocalDateTime(2014,Month.MARCH, 10, 15, 20, 30, 5555);
// {"y"=2014,  "yy"=14,  "yyyy"=2014}   {"M"=3, "MM"=03, "MMM"=MAR., "MMMM"=MARCH}  {"w"=11, "ww"=11}  {"d"=10, "dd"=10}  {"h"=3, "hh"=03}
// {"m"=20,  "mm"=20}  {"s"=30, "s"=30}  {"n"=5555,  "nnnn"=05555}

// 7.Метод parse переводит String в объект классов LocalDate, LocalTime, LocalDateTime
// 8.Если ваш String объект соответствует формату даты или времени по умолчанию, то вы можете не использовать 2-ой параметр метода parse-шаблон.
//   Если не соответствует или если вы не знаете форматов по умолчанию, то используйте шаблон.

import java.time.*;
import java.time.format.*;

public class DateTimeFormatter1 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2022, 5, 1);
        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(ld.format(d1)+"\n");

        LocalTime lt=LocalTime.of(5,10);
        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(lt.format(d2)+"\n");

        LocalDateTime ldt=LocalDateTime.of(2022,Month.MARCH,1,10,15);
        DateTimeFormatter d3=DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(ldt.format(d3)+"   "+ldt.format(d1)+"   "+ldt.format(d2));
        System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)+"\n");

        DateTimeFormatter formatter1=DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(ld);
        System.out.println(ld.format(formatter1)+"\n");
/*-4-*/ System.out.println(formatter1.format(ldt));
        DateTimeFormatter shortFormat=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(ld.format(shortFormat)+"\n");

/*-6-*/
        DateTimeFormatter shaff=DateTimeFormatter.ofPattern("M, dd, yyyy, hh:mm");
        System.out.println(ldt);
        System.out.println(ldt.format(shaff)+"\n");

/*-7-*/
        DateTimeFormatter shaff2=DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate  date1=LocalDate.parse("01 02 2022", shaff2);
        System.out.println(date1);

        LocalDate  date2=LocalDate.parse("2022-10-15");
        System.out.println(date2+"\n");
    }
}
