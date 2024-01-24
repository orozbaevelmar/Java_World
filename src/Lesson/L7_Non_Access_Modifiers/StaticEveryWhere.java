package Lesson.L7_Non_Access_Modifiers;

public class StaticEveryWhere {
    static int count;
    int course;
    String name;
    int a;
    StaticEveryWhere(String name2, int course2){
        count++;
        name=name2;
        course=course2;
    }

    void abc(){
        a++; // abc не статик поэтому увеличить (а) можно
        count++; // он и так существует
    }

    static void abcd(){
        count++;
        /*  a++;  */    //нельзя, потому что (a) не static, abcd()=static
        StaticEveryWhere st1=new StaticEveryWhere("Bekbol", 1);
        st1.a++; // а так можно, потому что он внутри обьекта.
    }

    public static void main(String[] args) {
        abcd();
/*      abc();       нельзя не статик         */
        StaticEveryWhere st5=new StaticEveryWhere("Bekbol", 1);
        st5.abc(); //так можно
    }
}
