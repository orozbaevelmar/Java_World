package Lesson.L17_Polymorphism_Instanceof_Casting;

import javax.print.Doc;

// polymorphism-множество форм
// Рolymorphism-это способность объекта принимать несколько форм. Объект в JAVA считается полиморфным, если он имеет
// более 1 связи IS-A.
// Рolymorphism-это способность метода вести себя по по разному в зависимости от того, объект какого класса
// вызывает этот метод.

// Перезаписанные методы также часто называют полиморфными

public class Polymorphism  {
    public static void main(String[] args) {
       
       /*  Employee1 emp1=new Teacher();
        Employee1 emp2=new Driver();
        Employee1 emp3=new Doctor();
        HelpAble h=new Teacher();
        emp1.help();

        Driver[] array1={new Driver(), new Driver()};
        Employee1[] array2={new Driver(), new Teacher(), new Doctor()};
        HelpAble[] array3={new Driver(), new Teacher(), new Doctor()};

        Employee1[] empArr={emp1, emp2, emp3};
        for (Employee1 emp:empArr){
            emp.work();
        } */
        /* Teacher t =new Teacher();
        Employee1 t1= new Teacher();


        System.out.println("ABCD");
        System.out.println(t1 instanceof Employee1);
        System.out.println(t1 instanceof HelpAble);
        System.out.println(t1 instanceof Teacher); */

        A a= new A();
        B b= new B();

        System.out.println(a instanceof B);
        System.out.println(b instanceof A);

        

    }
}
abstract class Employee1 implements HelpAble{
    abstract void work(); // you should override this method
    void sleep(){System.out.println("Employee sleeps");} // no need to override
    
}
class Teacher extends Employee1 implements  HelpAble{
    public void help(){System.out.println("Teacher helps");}
    void work(){System.out.println("Teacher works");}
}

class Driver extends Employee1 implements  HelpAble{
    public void help(){System.out.println("Driver helps");}
    void work(){System.out.println("Driver works");}
}
class Doctor extends Employee1 implements  HelpAble{
    public void help(){System.out.println("Doctor helps");}
    void work(){System.out.println("Doctor works");}
}
interface HelpAble{
    void help();
}

class A{};
class B extends A{}