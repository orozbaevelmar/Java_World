package Lesson.L7_Non_Access_Modifiers;

// Static-�������� ����������� ����� ������, � �� ��������� ��� ��������!
// ���������� Static �������, ���������� � ������� ������, � ������� �� ������ (Static.count)(Static.showCount)

public class Static {
    String name;
    int course;
    public static int count; // hier

    public Static(String name2, int course2) {
        count++; // ���� ������ static, �� count �� ���������!!!
        name = name2;
        course = course2;
        System.out.println("Student " + count + "�� �����");
    }
    public static void showCount(){
        System.out.println("����� ������� ���������="+count);
    }
    public static void main(String[] args) {
        Static st1=new Static("Aktan", 1);
        Static st2=new Static("Akylai", 4);
        Static st3=new Static("B�kbol", 3);

        System.out.println("\n"+Static.count);

        Static.showCount();
    }
}
