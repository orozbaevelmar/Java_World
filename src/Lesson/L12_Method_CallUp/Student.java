package Lesson.L12_Method_CallUp;

public class Student {
    String name;
    int course;
    double grade;
    Student(String name, int course, double grade){
        this.name=name;
        this.course=course;
        this.grade=grade;
    }
    public static void swap(Student st1, Student st2){ //st1 and st2 are just copy
        Student st3=st1;
        st1=st2;
        st2=st3;
        System.out.println("swap="+st1.name);
    }

    public static void changeName(Student change) {
    change.name="Takai";
    }

    public static void main(String[] args) {
        Student st1=new Student("Bek", 3,4.3);
        Student st2=new Student("Gul", 1, 5.0);

        swap(st1, st2);
        System.out.println(st1.name+" "+st2.name+" (ne pomenyalsa)");

        changeName(st2);
        System.out.println(st2.name+"  (pomenyalsa)");
    }

}
