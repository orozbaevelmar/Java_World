package Lesson.L14_Encapsulation_Inheritance;

// Parent---Super class---Parent class---Base class
// Child---Derived class---Child class---Subclass---Extended class

class Relationship{
    class Animal{  }
    class Mouse extends Animal{
        // Mouse is Animal
    }

    class Window{  }
    class House{
        Window w=new Window();
        // House has Window
    }
}


public class Inheritance /* Наследование */{
    public static void main(String[] args) {

        Employee emp=new Teacher();

        Doctor doc = new Doctor();
        doc.name="Bek";
        doc.age=35;
        doc.experience=12;
        doc.eat();
        doc.sleep();


        Surgeon surgeon=new Surgeon();
        surgeon.name="Asyl";

        /*doc.specialization="surgeon";*/
        doc.heal();
    }
}

class Employee extends java.lang.Object {
    String name;
    int age;
    int experience;

    void eat(){System.out.println("кушать");}
    void sleep(){System.out.println("спать");}
}

class Doctor extends Employee{
    void heal(){System.out.println("лечить");}
}

class Surgeon extends Doctor{
    String skalpel;
    void operacion(){}
}
class Dantist extends Doctor{

}

class Teacher extends Employee{
    int numberOfPupils;
    void teach(){System.out.println("учить");}
}

class Driver extends Employee{
    String carsName;
    void drive(){System.out.println("водить");}
}