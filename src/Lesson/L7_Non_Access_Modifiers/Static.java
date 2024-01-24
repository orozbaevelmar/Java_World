package Lesson.L7_Non_Access_Modifiers;

// Static-элементы принадлежат всему классу, а не отдельным его обьектам!
// Обращаться Static методам, переменным с помощью класса, в котором он создан (Static.count)(Static.showCount)

public class Static {
    String name;
    int course;
    public static int count; // hier

    public Static(String name2, int course2) {
        count++; // Если убрать static, то count не изменится!!!
        name = name2;
        course = course2;
        System.out.println("Student " + count + "го курса");
    }
    public static void showCount(){
        System.out.println("Всего создано студентов="+count);
    }
    public static void main(String[] args) {
        Static st1=new Static("Aktan", 1);
        Static st2=new Static("Akylai", 4);
        Static st3=new Static("Bеkbol", 3);

        System.out.println("\n"+Static.count);

        Static.showCount();
    }
}
