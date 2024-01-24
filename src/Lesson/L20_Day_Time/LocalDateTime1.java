package Lesson.L20_Day_Time;
// Получение информации из класса LocalDate
// getDayOfWeek()-->DayOfWeek
// getDayOfMonth()-->int
// getDayOfYear()-->int
// getMonth()-->Month
// getMonthValue()-->int
// getYear()-->int

// Получение информации из класса LocalDate
// getNano()-->int
// getSecond()-->int
// getMinute()-->int
// getHour()-->int

// Получение информации из класса LocalDateTime
// Данный класс включает в себя все методы из классов LocalDate и LocalTime
//

import java.time.*;

public class LocalDateTime1 {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.of(2022, Month.JANUARY,1);

        LocalDateTime ldt=LocalDateTime.of(2022,Month.SEPTEMBER, 1, 15,10);
        System.out.println(ldt.getMonth()+"     "+ldt.getMonthValue());

        LocalTime lt=LocalTime.of(16,40);

        System.out.println(lt.getSecond()+"    "+ldt.getNano());
        System.out.println();
    }
}
