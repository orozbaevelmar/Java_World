package Lesson.L18_equals_hashcode_toString_Initializer;

public class Test10 {
    void abc(short s){System.out.println("1");}
    void abc(int i) {System.out.println("2");}
    void abc(float f){System.out.println(3);}
    void abc(Object o){System.out.println(4);}
}
class Test12{
    public static void main(String[] args) {
        Test10 t=new Test10();
        char c='s';
        t.abc(c);
        t.abc(false);
        t.abc(3.32);
        t.abc(234.4F);
        t.abc((short)32);

        System.out.println("\n");

        System.out.println(X.s);
        System.out.println(X.s);
        new X();
        new X();
        System.out.println(X.s);
    }
}
class X{
    static String s="";
    {s+="A";}
    static {s+="B";}
    {s+="C";}
}
