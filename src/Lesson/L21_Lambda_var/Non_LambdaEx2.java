package Lesson.L21_Lambda_var;

import java.util.ArrayList;

public class Non_LambdaEx2 {

}
class Student6 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student6(String name, char sex, int age, int course, double avgGrade){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.course=course;
        this.avgGrade=avgGrade;
    }
}
class StudentInfo6 {
    void printStudent6(Student6 st){
        System.out.println("Name of student: "+st.name+", sex: "+ st.sex+", age: "+st.age+", course: "+st.course+", avgGrade: "+st.avgGrade);
    }
    void testStudents6(ArrayList<Student6> aL, StudentChecks6 sc){
        for (Student6 student6 :aL){
            if (sc.test1(student6)){
                printStudent6(student6);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student6> list6=new ArrayList<>();
        Student6 st1=new Student6("Aktan", 'm', 22, 3,3.2);
        Student6 st2=new Student6("Aidinai", 'f', 25, 1,3.3);
        Student6 st3=new Student6("Bek", 'm', 19, 4,4.0);
        Student6 st4=new Student6("Eliza", 'f', 27, 2,2.1);
        Student6 st5=new Student6("Esen", 'm', 20, 1,1.0);

        list6.add(st1);
        list6.add(st2);
        list6.add(st3);
        list6.add(st4);
        list6.add(st5);

        StudentInfo6 stInfo1=new StudentInfo6();

        FindStudentsOverGrade6 fsog=new FindStudentsOverGrade6();
        FindStudentsUnderGrade6 fsug=new FindStudentsUnderGrade6();
        FindStudentsOverAge6 fsoa=new FindStudentsOverAge6();
        FindStudentsUnderAge6 fsua=new FindStudentsUnderAge6();
        FindStudentsBySex6 fsbs=new FindStudentsBySex6();
        FindStudentsMixConditions6 fsmc=new FindStudentsMixConditions6();

        stInfo1.testStudents6(list6, fsog);
        System.out.println("---------------------------");
        stInfo1.testStudents6(list6, fsug);
        System.out.println("---------------------------");
        stInfo1.testStudents6(list6,fsoa);
        System.out.println("---------------------------");
        stInfo1.testStudents6(list6, fsua);
        System.out.println("---------------------------");
        stInfo1.testStudents6(list6, fsbs);
        System.out.println("---------------------------");
        stInfo1.testStudents6(list6, fsmc);
        System.out.println("---------------------------");
    }
}

interface StudentChecks6 {
    boolean test1(Student6 s);
}
class FindStudentsOverGrade6 implements StudentChecks6 {
    public boolean test1(Student6 s){
        return s.avgGrade>2.2;
    }
}
class FindStudentsUnderGrade6 implements StudentChecks6 {
    public boolean test1(Student6 s){
        return s.avgGrade<3 ;
    }
}
class FindStudentsOverAge6 implements StudentChecks6 {
    public boolean test1(Student6 s){
        return s.age>25;
    }
}
class FindStudentsUnderAge6 implements StudentChecks6 {
    public boolean test1(Student6 s){
        return s.age<27;
    }
}
class FindStudentsBySex6 implements StudentChecks6 {
    public boolean test1(Student6 s){
        return s.sex=='m';
    }
}
class FindStudentsMixConditions6 implements StudentChecks6 {
    public boolean test1(Student6 s){
        return (s.avgGrade<4 && s.age<27 && s.sex=='f');
    }
}
