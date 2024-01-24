package Lesson.L16_Abstract_Interface;
/// Интерфейс - это конструкция языка программирования, которую часто сравнивают с контрактом. В этом контракте указано,
/// что класс сможет делать,т.е. какие методы в нём будут присутствовать, если он имплементирует данный интерфейс.
/// Когда класс имплементирует какой либо интерфейс, он обязуется снабдить методы этого интерфейса телами (перезаписать
/// абстрактные методы); в противном случае класс должен стать абстрактным. T.о. если известно, что класс имплементировал
/// какой либо интерфейс, то в этом классе гарантированно будут методы из интерфейса.

// Interface содержит в себе только abstract методы
// Все abstract методы является PUBLIC
// Если не укзать самостоятельно, то компилятор добавит в опеределение всех переменных слова  ({public final static}int a=10)

// Невозможно создать объект интерфейс, потому что это не класс
// У интрефейса нет конструкторов
// Access modifier у всех топ-левел интерфейсов или public, или default
// Если не указать самостоятельно, то компилятор добавит в определение интерфейса слово abstract
// Интерфейс не может быть final
// Если не укзать самостоятельно, то компилятор добавит в определение всех non-default(не access modifier) и non-static слова abstract и public

// Если класс, который имплементировал интерфейс но не перезаписал все его методы, то этот класс должен обявляться abstract

import jdk.jfr.Name;

public class Interface {
    public static void main(String[] args) {
        Help_able h=new Driver();
        System.out.println(h.a);
        h.help();
        h.tushitPojar("Voda");
        /*h.drive   Wrong*/
    }
}
class Employee extends java.lang.Object {
    String name;
    int age;
    int experience;

    void eat(){System.out.println("кушать");}
    void sleep(){System.out.println("спать");}
}

class Teacher extends Employee implements Help_able{
    int numberOfPupils;
    void teach(){System.out.println("учить");}

    public void help(){System.out.println("Teacher spasaet");}
    public void tushitPojar(String s){System.out.println("Teacher tushit pojar s pomoshu="+s);}
}

class Driver extends Employee implements Help_able, Swim_able{
    String carsName;
    void drive(){System.out.println("водить");}

    public void help(){System.out.println("Driver spasaet");}
    public void tushitPojar(String s){System.out.println("Driver tushit pojar s pomoshu="+s);}
    public void swim(){System.out.println("Driver can swim");}
}

interface Help_able{
    public abstract void help();
    abstract void tushitPojar(String predmet);
    public final static int a=10;
}
abstract interface Swim_able{
    void swim();
}

abstract class X implements Swim_able{ }
abstract  class Y extends X{ }
class Z extends Y{
    public void swim(){
        System.out.println("XYZ swim");
    }
}