package Lesson.L20_Day_Time;

import Lesson.L11_Tree.Test;

import java.lang.reflect.Array;
import java.time.format.*;
import java.time.*;
import java.util.Arrays;

public class Test5 {
    DateTimeFormatter form1=DateTimeFormatter.ofPattern("YYYY, MM-dd !! hh:mm");
    DateTimeFormatter form2=DateTimeFormatter.ofPattern("hh:mm, dd/MM/yy");

     void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period period, Duration duration){
         LocalDateTime nachalo=ldt1;
        while(nachalo.isBefore(ldt2)){
            System.out.print("Работаем с : "+nachalo.format(form1));
            nachalo=nachalo.plus(period);
            System.out.println("    До : "+nachalo.format(form1));
            System.out.print("Отдыхаем с : "+nachalo.format(form2));
            nachalo=nachalo.plus(duration);
            System.out.println("    До : "+nachalo.format(form2));
        }
    }

    public static void main(String[] args) {
        LocalDateTime ldt5=LocalDateTime.of(2022,5,1, 23, 20);
        LocalDateTime ldt6=LocalDateTime.of(2027, 9,1,20,23);
        Period per=Period.ofYears(1);
        Duration dur=Duration.ofHours(2);

        Test5 t=new Test5();
        t.smena(ldt5, ldt6, per, dur);

    }
}
