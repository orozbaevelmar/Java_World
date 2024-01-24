package Lesson.L15_Overriding_Hiding_Final;

// Overloaded-->von variable hangt ab
// Overrided-->von Object hangt ab
// Все переменные имеют имеют compile time binding

// Compile Time Binding--->private methods, static methods, final methods
// Run Time Binding--->all other methods

public class Time_Binding {
    void abc(Tiere t){
        System.out.println("Ti-->overloaded");
    }
    void abc(Mouse m) {
        System.out.println("Mou-->overloaded");
    }

    public static void main(String[] args) {
        Time_Binding t=new Time_Binding();
        Tiere an=new Mouse();

        t.abc(an);
        an.getName();
    }
}
class Tiere {
    void getName(){
        System.out.println("Tiere-->overrided");
    }
}
class Mouse extends Tiere {
    void getName(){
        System.out.println("Mouse-->overrided");
    }
    void getName(int i) {
        System.out.println("How are you");
    }
}
