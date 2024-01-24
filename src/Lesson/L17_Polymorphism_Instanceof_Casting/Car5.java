package Lesson.L17_Polymorphism_Instanceof_Casting;

public class Car5{
    /*static*/ int a=5;
    public static void main(String[] args) {
        Car5 c=new Car5();
        System.out.println(c.a);
        c=null;
        System.out.println(c.a);
    }
}
