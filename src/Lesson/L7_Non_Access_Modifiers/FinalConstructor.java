package Lesson.L7_Non_Access_Modifiers;

public class FinalConstructor {
    String color="blue";
    String engine="V6";
}
class Menschen{
    String name="Beka";
    final FinalConstructor fc=new FinalConstructor();

    public static void main(String[] args) {
        Menschen h1=new Menschen();
       /* h1.fc=new FinalConstructor; (��-�� final ������ ������� ����� FinalConstructor)
        h1.fc=new FinalConstructor;*/
        h1.fc.engine="V8";          // (�� ����� ����� ��������)
    }
}