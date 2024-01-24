package Lesson.L21_Lambda_var;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Non_LambdaEx1 {
}
class Student5 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student5(String name, char sex, int age, int course, double avgGrade){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.course=course;
        this.avgGrade=avgGrade;
    }
}
class StudentInfo5 {
    void printStudent(Student5 st){
        System.out.println("Name of student: "+st.name+", sex: "+ st.sex+", age: "+st.age+", course: "+st.course+", avgGrade: "+st.avgGrade);
    }
    void printStudentsOverGrade(ArrayList <Student5> al, double avgGrade){
        for (Student5 s:al){
            if (s.avgGrade>avgGrade) printStudent(s);
        }
    }
    void printStudentsUnderGrade(ArrayList <Student5> al, double avgGrade){
        for (Student5 s:al){
            if (s.avgGrade>avgGrade) printStudent(s);
        }
    }
    void printStudentsOverAge(ArrayList <Student5> al, int age){
        for (Student5 s:al){
            if (s.age>age) printStudent(s);
        }
    }
    void printStudentsUnderAge(ArrayList <Student5> al, int age){
        for (Student5 s:al){
            if (s.age>age) printStudent(s);
        }
    }
    void printStudentsBySex(ArrayList <Student5> al, char sex){
        for (Student5 s:al){
            if (s.sex==sex) printStudent(s);
        }
    }
    void printStudentsMixConditions(ArrayList <Student5> al, double avgAGrade, int age, char sex){
        for (Student5 s:al){
            if (s.avgGrade>avgAGrade && s.age<age && s.sex==sex) printStudent(s);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student5> list=new ArrayList<>();
        Student5 st1=new Student5("Aktan", 'm', 22, 3,3.2);
        Student5 st2=new Student5("Aidinai", 'f', 25, 1,3.3);
        Student5 st3=new Student5("Bek", 'm', 19, 4,4.0);
        Student5 st4=new Student5("Eliza", 'f', 27, 2,2.1);
        Student5 st5=new Student5("Esen", 'm', 20, 1,1.0);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo5 stInfo=new StudentInfo5();
        stInfo.printStudentsOverGrade(list, 2.2);
        System.out.println("---------------------------------");
        stInfo.printStudentsUnderGrade(list, 3.5);
        System.out.println("---------------------------------");
        stInfo.printStudentsOverAge(list, 22);
        System.out.println("---------------------------------");
        stInfo.printStudentsBySex(list, 'm');
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");

    }
}
