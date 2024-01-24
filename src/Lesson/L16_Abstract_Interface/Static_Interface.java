package Lesson.L16_Abstract_Interface;

// Если не указать самостоятельно, то компилятор добавит в определение всех Static методов слово Public
// Static методы не наследуются ни одним классом, который имплементирует интерфейс
// Для вызова Static метода необходимо использовать имя интерфейса

public class Static_Interface extends H implements I3,I4  {
    H method1(){return new Static_Interface();}
    I3 method2(){return new Static_Interface();}

    static I4 method3(I4 i){return new Static_Interface();}

    public static void main(String[] args) {
        /*Static_Interface.def(){}*/ //Wrong
        I3.def();
        I4 interf=new D();
        method3(interf);
    }
}
interface I3{ static void def(){System.out.println("Static method 1");}}
interface I4{static void def(){System.out.println("Static method 2");}}

abstract class H{ }
class D implements I4{ }