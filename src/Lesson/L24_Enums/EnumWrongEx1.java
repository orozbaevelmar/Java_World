package Lesson.L24_Enums;

public class EnumWrongEx1 {
    void method1(String dayOfWeek){ // работает некорректно
        System.out.println("Today is "+dayOfWeek);
    }

    public static final int MONDAY=1;
    void method2(int i){ //
        System.out.println("Today is "+i);
    }

    public static void main(String[] args) {
        EnumWrongEx1 e=new EnumWrongEx1();
        e.method1("Tuesday"); // TRUE
        e.method1("Privet"); // Wrong

        e.method2(MONDAY); // True
        e.method2(135); // WRONG
    }
}
