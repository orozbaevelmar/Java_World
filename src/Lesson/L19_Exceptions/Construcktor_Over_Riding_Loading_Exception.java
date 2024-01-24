package Lesson.L19_Exceptions;
// Only for CheckedException, Not for UncheckedException

// 1.Если класс перезаписывает метод из супер класса или имплементирует метод из интерфейса непозволительно добавлять в его
//   сигнатуру новые checked исключения. Можно в сигнатуре метода супер метода использовать только исключения из перезаписанного метода супер класса
//   или дочерние классы данных исключений.
// 2.Вышеописанное правило никаким образом не относится к Overloaded методам
// 3.Конструктор может выбрасывать исключения. Конструктор в своей сигнатуре должен описывать все исключения конструктора супер класса, который он
//   вызывает, может описывать супер классы данных исключений, а также добавлять новые исключения.(На констр. нельзя try написать).
// 4.Указание в сигнатуре метода исключения, которое не будет выбрасываться в данном методе не является ошибкой.

// 5.Указание в сгнатуре метода исключения, которое не будет выбрасываться в данном методе не является ошибкой.
import java.io.*;
public class Construcktor_Over_Riding_Loading_Exception {
    public static void main(String[] args) throws Exception {
        Animal a=new Mouse();
        try{
            a.run();
        }
        catch(IOException e){
            System.out.println("Exception poiman");
        }


        try{
            Human h=new Human("Bek", 32);
        }
        catch (Exception e){
            System.out.println("Human Exception");
        }

        Human h=new Human("Bek", -1);
    }
}
class Animal {
    void run() throws IOException, FileNotFoundException{
        System.out.println("Animal runs");
    }
    void run(int a) throws Exception{
        System.out.println();
    }
}
class Mouse extends Animal{
// -1-  Нельзя на Override Exception, weil Exception больше чем IOException.
    void run() throws /*Exception WRONG*/ IOException, FileNotFoundException, ArrayIndexOutOfBoundsException{
        System.out.println("Mouse runs");
    }
}

class Home{
    Home()throws FileNotFoundException{

    }
}
class Window extends Home{
/*-3-*/    Window()throws FileNotFoundException, Exception{super();}
}

class Human{
    String name;
    int age;
    Human(String name, int age) throws Exception{
        if (age<0) {
            throw new Exception("Wrong age");
        }
        this.name=name;
        this.age=age;
    }
}
