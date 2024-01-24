package Lesson.L24_Enums;

// Enum -->type safe

public class EnumEx2 {
    public static void main(String[] args) {
        Today today1=new Today(WeekDays.SATURDAY);
        today1.daysInfo();
        /*Today today2=new Today("Privet");
        today2.daysInfo();

        Today today3=new Today(123);
        today3.daysInfo();

        Today today4=new Today(WeekDays.Privet);
        today4.daysInfo();*/
    }
}
enum WeekDays{
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY,FRIDAY,
    SATURDAY,SUNDAY;
}
class Today{
    WeekDays weekDay;
    public Today(WeekDays weekDay){
        this.weekDay=weekDay;
    }
    void daysInfo(){
        switch(weekDay){
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
    }
}
