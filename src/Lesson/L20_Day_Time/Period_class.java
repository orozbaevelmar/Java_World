package Lesson.L20_Day_Time;

import java.time.*;

// 1.Класс Period имеет конструктор с access modifier private.Методы of возвращают объект типа Period.
//   public static Period ofDays(int days);
//                        ofWeeks(int weeks)
//                        ofMonths(int months)
//                        ofYears(int years)
//                        of(int years, int months, int days)
// 2.Методы plus и minus могут быть использованы для прибавлениия  и отнимания периодов к/от объектов класса LocalDate и LocalDateTime.При попытке
//   использование методов plus или minus для сложения или отнимания периода к/от объекта LocalTime будет выброшен exception.
// 3.При создании объекта класса Period не работает method chaining метода of. При попытке method chaining только последний метод of имеет значение.

public class Period_class {
    static void smenaDejurnogo(LocalDate nachalo, LocalDate konec, Period period){
            LocalDate data=nachalo;
            while (data.isBefore(konec)){
                System.out.println("Nastupilo data "+data+". Para menyat dejurnogo");
                data=data.plus(period);
            }
    }
    public static void main(String[] args) {
        LocalDate nachalo=LocalDate.of(2022, Month.SEPTEMBER, 1);
        LocalDate konec=LocalDate.of(2024, Month.JANUARY, 1);
        Period period1=Period.ofMonths(1);
        smenaDejurnogo(nachalo, konec, period1);

        System.out.println();
        Period period2=Period.ofYears(1);
        smenaDejurnogo(nachalo, konec, period2);

//-2-
        LocalDateTime ldt=LocalDateTime.of(2022, 9,2,10,5);
        Period p=Period.of(1,3,15);
        ldt.minus(p);

        System.out.println();
        LocalDate nachalo5=LocalDate.of(2022,Month.JANUARY, 1);
/*-3-*/ Period period5=Period.ofMonths(3).ofDays(10); // Period period5=Period.ofMonths(3);
        System.out.println(nachalo5.plus(period5));   // period5=Period.ofDays(10);
    }
}
