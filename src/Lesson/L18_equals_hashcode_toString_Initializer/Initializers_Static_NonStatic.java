package Lesson.L18_equals_hashcode_toString_Initializer;

// Initializer block срабатывает каждый раз, когда создается новый объект соответствующего класса
// Static initializer block срабатывает каждый раз, когда класс загружается в память.

// Static initializer(ах) нельзя обращаться нестатическим переменным
// |_> можно константам дать значение(у которых нет значений) как и в конструкторах можно

public class Initializers_Static_NonStatic {
    String s1;
    {
        s1="Ok";
        System.out.println("Hello");   //-1-
        int i=123;
        System.out.println(i);
        System.out.println(s1);
    }
    /*String s1; метод sout не выполниться*/

    public static void main(String[] args) {
        Initializers_Static_NonStatic s=new Initializers_Static_NonStatic();
        Initializers_Static_NonStatic s1=new Initializers_Static_NonStatic();
        System.out.println();
        Test8 t1=new Test8(2);
        System.out.println();
        Test8 t2=new Test8();

        Test9 t9=new Test9();
        System.out.println(t9.a);
    }
}

class Test8{
    Test8(){
        System.out.println("Eto konstruktor");
    }
    Test8(int i){
        this();
        System.out.println("Eto konstrucktor s parametrom");
    }
    {
        System.out.println("Eto initializer--111");
    }

    static{
        System.out.println("Eto STATIC initializer-1");
    }

    {
        System.out.println("Eto initializer--222");
    }
    static {
        System.out.println("Eto STATIC initializer-2");
    }
    {
        System.out.println("Eto initializer--333");
    }
}

class Test9{
    int a=3;
    Test9(){
        a=4;
    }
    {
        a=5;
    }
}

class A{
    final int a;
    A(){
        a=21;
    }

    final int g;
    {
        g=23;
    }
    static final int s;
    static {
        s=32;
    }
}
class B{
    String s1="ok";
    {
        System.out.println(s1);
    }
    static int i=0;
    static{
        System.out.println(i);
    }
    {i+=1;
        System.out.println(i);}
    B(){
        System.out.println("Eto konstructor--B");
    }

    public static void main(String[] args) {
        System.out.println("Privet vsem");
    }
    B b=new B();
}

class D{
   static{}
    static void abc(int a){
        System.out.println(a+" ");
    }
    D(){abc(5);}
    static{abc(4);}
    {abc(6);}
    static{new D();}
    {abc(8);}

    public static void main(String[] args) {

    }
}

