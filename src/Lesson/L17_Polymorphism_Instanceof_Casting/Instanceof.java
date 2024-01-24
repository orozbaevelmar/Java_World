package Lesson.L17_Polymorphism_Instanceof_Casting;

// о
// Оператор InstanceOF проверяет, есть ли между объектом и классом/интерфейсом связь IS-A. Если связь IS-A невозможно,
//          то компилятор выдает ошибку.
//

public class Instanceof {
    public static void main(String[] args) {
        Employee5 emp5=new Teacher5();
        Employee5 emp6=new Driver5();
        Employee5 emp7=new Doctor5();

        Employee5 [] empArr={emp5, emp6, emp7};

        System.out.println(emp5 instanceof Teacher5);
        System.out.println(emp5 instanceof Driver5);
        System.out.println(emp5 instanceof HelpAble);
        System.out.println(emp6 instanceof HelpAble);

        String s1=null;
        System.out.println();
        System.out.println(s1 instanceof String);
        System.out.println(null instanceof String);

        System.out.println(empArr instanceof Object);
    }
}
abstract class Employee5 {
    void sleep(){System.out.println("Employee sleeps");}
    abstract void work();
}
class Teacher5 extends Employee5 {
    /*public void help(){System.out.println("Teacher helps");}*/
    void work(){System.out.println("Teacher works");}
}

class Driver5 extends Employee5 implements  HelpAble{
    public void help(){System.out.println("Driver helps");}
    void work(){System.out.println("Driver works");}
}
class Doctor5 extends Employee5 implements  HelpAble{
    public void help(){System.out.println("Doctor helps");}
    void work(){System.out.println("Doctor works");}
}