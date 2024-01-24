package Lesson.L20_Day_Time;

import java.time.*;

// Класс Duration имеет конструктор с access modifier PRIVATE. Методы of возвращают объект типа Duration
// public static Duration ofDays(long days);
//                        ofHours(long hours);
//                        ofMinutes(long minutes);
//                        ofSeconds(long seconds);
//                        ofMillis(long millis);
//                        ofNanos(long nanos);
// 2.Методы plus и minus могут быть использованы для прибавлениия и отнимания объекта класса Duration к/от объекта LocalTime и LocalDateTime. При
//   попытке использование методов plus или minus для сложения или отнимания объекта класса Duration к/от объекта класса LocalDate будет выброшен exception.
// 3.При создании объекта класса Duration не работает method chaining метода of. При попытке method chaining только последний метод of имеет значение.

public class Duration_class {
    public static void main(String[] args) {
        Duration d=Duration.ofHours(3);
        Duration d1=Duration.ofMinutes(30);
        Duration d2=Duration.ofDays(5);
        Duration d3=Duration.ofMillis(234432);
         /* ---WRONG---  LocalTime nachalo=LocalTime.of(10, 15, 20);
        System.out.println(nachalo.plus(d));*/
        Period p=Period.ofMonths(3);

        LocalDateTime ldt=LocalDateTime.of(2022,1,1,10,15);
        System.out.println(ldt.plus(d).plus(p).plus(p));

    }
}
