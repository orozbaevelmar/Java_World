package Lesson.L20_Day_Time;

// LocalDate класс содержит информацию о дне:год, месяц, день
// LocalTime класс сожержит информацию о времени:час, минуты, секунда, наносекунда
// LocalDateTime класс содержит информацию о дне и времени: год, месяц, день час, минуты, секунда, наносекунда
// Данные классы содержаться в пакете java.time
// Данные 3 класса имеют статический метод now(), который возвращает соответствующие объекты с текущими значениями

// 1.У этих 3-х классов конструктор имеет access modifier private. Поэтому,мы не можем создавать объекты этих классов используя конструкторы.
//   Методы of возвращают объект соответствующего типа.
// 2.public static LocalDate of(int year, int month, int day)
// 2.public static LocalDate of(int year, Month month(Month.MAY), int day)

// 3.public static LocalTime of(int час, int минута)
// 3.public static LocalTime of(int час, int минута, int секунда)
// 3.public static LocalTime of(int час, int минута, int секунда, int наносекунда)

// 4.public static LocalDateTime(int year, int month, int dayOfMonth, int hour, int minute)
// 4.public static LocalDateTime(int year, int month, int dayOfMonth, int hour, int minute, int second)
// 4.public static LocalDateTime(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond)
// 4.public static LocalDateTime(LocalDate day, LocalTime time);

// 5.При некорректном указании параметров метода of выбрасывается соответствующий exception;

// 6.Объекты 3-х классов являются immutable(Wie String)
// Method LocalDate
// plusDays(long daysToAdd)-->LocalDate  //  minusDays(long daysToSubtract)-->LocalDate
// plusWeeks(long weeksToAdd)-->LocalDate // minusWeeks(long weeksToSubtract)-->LocalDate
// plusMonth(long monthToAdd)-->LocalDate // minusMonth(long monthToSubtract)-->LocalDate
// plusYears(long yearsToAdd)-->LocalDate // minusYears(long yearsToSubtract)-->LocalDate
// LocalTime:
//          plusHours(); minusHours();
//          plusMinutes(); minusMinutes();
//          plusSeconds(); minusSeconds();
//          plusNanos(); minusNanos();

// 1.Методы isAfter, isBefore могут быть использованы для сравнения объектов классов LocalDate,LocalTime, LocalDateTime. Данные методы
//   возвращают boolean. Компилятор разрешает сравнивать только объекты соответствующих классов.

import java.time.*;
public class Klass {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        //LocalDate ld=new LocalDate(2022-10-27); Wrong(because: private)
        Car c= Car.createCar();

        System.out.println();
        LocalDate ld1= LocalDate.of(2014, 5, 15);
        LocalDate ld2=LocalDate.of(2015, Month.MAY, 13);

        LocalTime lt1=LocalTime.of(15,30);
        LocalTime lt2=LocalTime.of(23,43,1,999999999);

        LocalDateTime ldt1=LocalDateTime.of(2022, 9,2,1,3);
        LocalDateTime ldt2=LocalDateTime.of(ld1, lt1);

        LocalDate ld5=LocalDate.of(2022, 10,1);
/*-6-*/ ld5.plusDays(5);
        System.out.println(ld5);
        ld5=ld5.plusDays(5);
        System.out.println(ld5);
        LocalDate ld6=ld5.plusDays(15);
        System.out.println(ld6);
        ld5=ld5.plusDays(40);
        System.out.println(ld5);

        LocalTime lt5=LocalTime.of(15,30);
        lt5=lt5.minusNanos(5);
        System.out.println(lt5+"\n");

        LocalDateTime ldt5=LocalDateTime.of(2022, 5, 10, 15,20,25);
        ldt5=ldt5.plusYears(3).minusMonths(2).plusMinutes(5).minusSeconds(25);
        System.out.println(ldt5);

        System.out.println();
        LocalDate ld8 = LocalDate.of(2022, 2, 1);
        LocalDate ld9 = LocalDate.of(2022, 2, 2);
        System.out.println(ld8.isAfter(ld9)+"   "+ld8.isBefore(ld9));

    }
}
class Car{
    private Car(){}
    static Car createCar(){return new Car();}
}