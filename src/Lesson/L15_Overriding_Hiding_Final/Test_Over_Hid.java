package Lesson.L15_Overriding_Hiding_Final;

public class Test_Over_Hid {
    public static void main(String[] args) {
        Animal3 an=new Lion();
        System.out.println(an.a);
        System.out.println(an.b);
        an.abc();
        an.def();
    }
}
class Animal3{
    int a=5;
    static int b=5;
    void abc(){System.out.println("Non-static method from Animal");}
    static void def(){System.out.println("Static method from Animal");}
}
class Lion extends Animal3{
    int a=10;
    static int b=10;
    void abc(){System.out.println("Non-static method from Lion");}
    static void def(){System.out.println("Static method from Lion");}
}