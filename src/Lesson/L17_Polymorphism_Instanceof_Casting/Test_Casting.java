package Lesson.L17_Polymorphism_Instanceof_Casting;

public class Test_Casting {
    public static void main(String[] args) {
        Test3 t3=new Test3();
        System.out.println(((Test3)t3).a);
        System.out.println(((Test2)t3).a);
        System.out.println(((Test1)t3).a);
// Переменные(HIDE) можно изменить, но нельзя изменить методов(OVERRIDE)
        ((Test3)t3).abc();
        ((Test2)t3).abc();
        ((Test1)t3).abc();
        System.out.println();
        t3.show();
    }
}
class Test1{
int a=5;
void abc(){System.out.println("Ok_1");}
}
class Test2 extends Test1 {
    int a = 10;
    void abc(){System.out.println("Ok_2");}
}
class Test3 extends Test2{
    int a=15;
    void abc(){System.out.println("Ok_3");}

    void show(){super.abc();}
}



