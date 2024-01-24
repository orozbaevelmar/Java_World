package Lesson.L16_Abstract_Interface;

// 1.26.08
// Данное слово Default никаким образом не связано с access modifier. Access modifier DEFAULTных методов в интерфейсе-PUBLIC,
//                                          который будет добавлен компилятором, если его не указать самостоятельно
// Default методы предоставляют дефолтную реализацию метода и могут быть созданы только в интерфейсе.
// Если в интерфейсе создан default метод, то он должен иметь тело.
// Default методы не должен быть static, final или abstract

public class Default_Method_In_Interface {
    public static void main(String[] args) {
        Z2 z=new Z2();
        z.abc();
        z.def();
    }
}
interface I1{
    void abc();
    public default void def(){System.out.println("Eto method default");}
}
class Z2 implements I1{
    public void abc(){System.out.println("Eto method abc");}
}

interface I2 extends I1{
    void abc();
    /*default void abc(){System.out.println("Eto method default!!!");}*/
}