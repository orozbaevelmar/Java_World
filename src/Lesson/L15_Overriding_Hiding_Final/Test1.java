package Lesson.L15_Overriding_Hiding_Final;

public class Test1 {
    public static void main(String[] args) {
        A name=new C();
        name.abc(new A());
        name.abc(new B());
        name.abc(new C());
        System.out.println();

        B n=new C();
        n.abc(new A());
        n.abc(new B());
        n.abc(new C());

        System.out.println();

        C m=new C();
        m.abc(new A());
        m.abc(new B());
        m.abc(new C());

    }
}

class A{
    void abc(A a){
        System.out.println("A");
    }
}
class B extends A{
    void abc(B b1){
        System.out.println("B");
    }
    void abc(A a1){
        System.out.println("Override B-->A");
    }
}
class C extends B{
    void abc(){
        System.out.println("C000");
    }
    void abc(B b2){
        System.out.println("C");
    }
    void abc(A a2){
        System.out.println("Override A-->C");
    }
}
