package Lesson.L24_Enums;

// 1.enum-это способ ограничения определенного рода информации конкретным списком возможных вариантов
// 2.Конструктор в enum имеет access modifier "private" и не нуждается во внешнем вызове
// 3.enum является дочерним классом для java.lang.Enum
// 4.Часто используемые методы: valueOf, values
// 5.

import java.util.Arrays;

public class EnumEx3 {
    public static void main(String[] args) {
        Today3 today3=new Today3(WeekDays3.SUNDAY);
        today3.daysInfo3();

        /*WeekDays3 w=WeekDays3.FRIDAY;*/
        System.out.println("-------------");
        System.out.println(today3.weekDay3);
        System.out.println("-------------");
        WeekDays3 w1=WeekDays3.FRIDAY;
        WeekDays3 w2=WeekDays3.FRIDAY;
        WeekDays3 w3=WeekDays3.MONDAY;
        System.out.println(w1==w2);
        System.out.println(w1==w3);
        System.out.println("-------------");
        /*System.out.println(WeekDays3.FRIDAY==WeekDays4.FRIDAY);  WRONG*/
        System.out.println(WeekDays3.FRIDAY.equals("equals = "+WeekDays4.FRIDAY));
        System.out.println("-------------");
/*- 4 - */        WeekDays3 w15=WeekDays3.valueOf("MONDAY");
        System.out.println(w15);

        WeekDays3[] array=WeekDays3.values();
        System.out.println(Arrays.toString(array));

    }
}
enum WeekDays3{
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood3;
    /*private*/ WeekDays3(String mood3){
        this.mood3=mood3;
    }

    public String getMood3(){
        return mood3;
    }
}

enum WeekDays4 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

class Today3{
    WeekDays3 weekDay3;
    public Today3(WeekDays3 weekDay3){
        this.weekDay3=weekDay3;
    }
    void daysInfo3(){
        switch(weekDay3){
            case MONDAY:
            case TUESDAY:
            case THURSDAY:
            case WEDNESDAY:
            case FRIDAY:
                System.out.println("Idi na rabotu");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Mojno otdohnut");
                break;
        }
        System.out.println("Nastroenie v etot den: "+weekDay3.getMood3());
    }
}