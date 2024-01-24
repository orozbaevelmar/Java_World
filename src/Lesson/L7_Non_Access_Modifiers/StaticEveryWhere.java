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
        a++; // abc �� ������ ������� ��������� (�) �����
        count++; // �� � ��� ����������
    }

    static void abcd(){
        count++;
        /*  a++;  */    //������, ������ ��� (a) �� static, abcd()=static
        StaticEveryWhere st1=new StaticEveryWhere("Bekbol", 1);
        st1.a++; // � ��� �����, ������ ��� �� ������ �������.
    }

    public static void main(String[] args) {
        abcd();
/*      abc();       ������ �� ������         */
        StaticEveryWhere st5=new StaticEveryWhere("Bekbol", 1);
        st5.abc(); //��� �����
    }
}
