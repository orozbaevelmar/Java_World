package Lesson.L7_Non_Access_Modifiers;

// final для переменной-значение этой переменной измениться не может;

public class Final_Constant {
    public final int a=10; //значение a нельзя изменить!!!

    public static void main(String[] args) {
        Final_Constant ob=new Final_Constant();
        //ob.a = ob.a * 2; из-за final нельзя так писать
        System.out.println(ob.a);
    }
}

class A{
    final int b;
    static final int fin=19;
    final int g;
    A(){
        b=19;
    }


    {
        g=3;
    }
}