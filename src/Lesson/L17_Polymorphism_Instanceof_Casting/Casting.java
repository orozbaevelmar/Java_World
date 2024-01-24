package Lesson.L17_Polymorphism_Instanceof_Casting;

// Reference data types casting
// Casting-это процесс когда вы заставляете переменную одного типа данных вести себя как переменная другого типа данных.
// Casting возможен только тогда, когда между классами/интерфейсами существует IS-A взаимоотношение. Делая Casting,
// вы не меняете тип данных объекта, а заставляете его чуствовать себя как объект другого типа.

// Casting из sub класса в super класс происходит автоматически - Upcasting     Employee e=new Doctor();
// Casting из super класса в sub класс НЕ происходит автоматически-Downcasting{  Employee emp=new Driver();   Driver d=(Doctor)emp   }
// Если между классами/интерфейсами нет IS-A взаимоотношения, компилятор не допустит Casting
// Даже если компилятор допустил Casting, выскочит Runtime exception, если объект, который мы делаем cast на самом деле
//                  не принадлежит классу, на который мы делаем cast


public class Casting {
    public static void main(String[] args) {
        Employee8 emp1=new Doctor8();
        Employee8 emp2=new Driver8();
        Employee8 emp3=new Teacher8();
        Employee8[] array={emp1,emp2,emp3};
        for (Employee8 e:array){
            if (e instanceof Driver8){
                System.out.println(((Driver8)e).nazvanieMashin);
                ((Driver8)e).vodit();
            }
        }

        /*Doctor8 d1=emp1;  Wrong */
        Doctor8 d1=(Doctor8)emp1;
        d1.lechit();

        /*System.out.println(emp1.specializaciya);   Wrong */
        System.out.println(((Doctor8)emp1).specializaciya);
        /*System.out.println(((Casting)emp1).specializaciya);   Wrong  (Casting hat keine Verbindung mit Doctor8, Doctor8 extends Employee8*/

        Help_Able h=new Doctor8();
        h.help();
        ((Doctor8)emp1).help();

        System.out.println(((Doctor8)h).specializaciya);
        ((Doctor8)h).lechit();

    }
}
class Employee8 {
    double salary=100;
    String name="Akyl";
    int age;
    int experience;
    void eat(){System.out.println("Kushat");}
    void sleep(){System.out.println("Employee sleeps");}
}
class Teacher8 extends Employee8{
    int kolichestvoUchenikov;
    void uchit(){System.out.println("uchit");}
}
class Driver8 extends Employee8{
    String nazvanieMashin="Mercedes";
    void vodit(){System.out.println("Vodit");}
}
class Doctor8 extends Employee8 implements Help_Able{
    String specializaciya;
    void lechit(){System.out.println("lechit");}
    public void help(){System.out.println("Doctor okazyvaet pomosh");}
}
interface Help_Able{
    void help();
}
