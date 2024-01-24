package Lesson.L16_Abstract_Interface;
// Начиная с Java 9

// Private interface метод не может быть abstract
// Private interface метод может быть использован только внутри интерфейса
// Private static метод может быть использован внутри Static или Non-static методов
// Private non-static метод НЕ может быть использован внутри private static методов
//

public class Private_Method {
}
interface G1 {
    private void method1() {System.out.println("Private non-static interface");}
    private static void method2() {System.out.println("Private static interface");}
    default void method3() {method2();}

    abstract void method4();

    static void method5() {
        method2();
        /*method1();*/ // Wrong (Because NON-STATIC)   }
    }
}