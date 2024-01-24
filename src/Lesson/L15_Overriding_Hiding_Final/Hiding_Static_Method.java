package Lesson.L15_Overriding_Hiding_Final;

// это перекрытие STATIC методов из PARENT класса в SUB классе

// Методы считаются HIDDEN если:
// имя в () классе такое же, что и в () классе
// Список аргументов в () классе такой же, что и в () классе
// RETURN TYPE в SUB классе такой же, что и в PARENT классе или же RETURN TYPE в SUB классе-это SUB класс RETURN TYPE из PARENT класса(covariant return types)
// Access modifier в SUB классе такой же или менее строгий, чем в PARENT классе
// Если в PARENT классе метод является STATIC, то и в SUB классе он должен быть STATIC

// Variable hiding - обьявление в SUB классе переменной с таким же именем (не обьязательно типом), что и в PARENT классе

// (OVERRIDE moglich) Все методы, которые не являются STATIC, FINAL, PRIVATE
// (HIDE moglich) Static методы, non-PRIVATE variables

// PRIVATE методы и переменные нельзя делать (НИ OVERRIDE), (НИ HIDE). не наследуются
// FINAL методы нельзя делать (НИ OVERRIDE), (НИ HIDE)


public class Hiding_Static_Method {
    public static void main(String[] args) {
        Human t=new Teacher();
        t.sleep();
        System.out.println(t.salary);
        Teacher teacher=new Teacher();
        System.out.println(teacher.salary);
    }
}
class Human {
    static void sleep() {
        System.out.println("Human sleep");
    }
// Variable hiding - обьявление в SUB классе переменной с таким же именем (не обьязательно типом), что и в PARENT классе
    int salary=100;
}
class Teacher extends Human{
    static void sleep(){
        System.out.println("Teacher sleep");
    }
// Variable hiding - обьявление в SUB классе переменной с таким же именем (не обьязательно типом), что и в PARENT классе
    String salary="zwei hundert";
}
