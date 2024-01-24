package Lesson.L21_Lambda_var;
// 1.Лямбда выражения работают с интерфейсом, в котором есть ТОЛЬКО 1 метод. Такие интерфейсы называются функциональными интерфейсами, т.е.
//   интерфейсами, пригодными для функционального программирования
// 2.public interface Predicate <T>{
//       boolean test(T t)
//   }
// 3. Интерфейс Predicate <T> находится в java.util.function

import java.util.ArrayList;
import java.util.function.*;

public class interfacePredicate {
}
class Student3 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student3(String name, char sex, int age, int course, double avgGrade){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.course=course;
        this.avgGrade=avgGrade;
    }
}
class StudentInfo3 {
    void printStudent(Student3 st){
        System.out.println("Name of student: "+st.name+", sex: "+ st.sex+", age: "+st.age+", course: "+st.course+", avgGrade: "+st.avgGrade);
    }
// PREDICATE
    void testStudents(ArrayList<Student3> aL, Predicate<Student3> sc){
        for (Student3 student3 :aL){
            if (sc.test(student3)){
                printStudent(student3);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student3> list=new ArrayList<>();
        Student3 st1=new Student3("Aktan", 'm', 22, 3,3.2);
        Student3 st2=new Student3("Aidinai", 'f', 25, 1,3.3);
        Student3 st3=new Student3("Bek", 'm', 19, 4,4.0);
        Student3 st4=new Student3("Eliza", 'f', 27, 2,2.1);
        Student3 st5=new Student3("Esen", 'm', 20, 1,1.0);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo3 stInfo=new StudentInfo3();

        stInfo.testStudents(list, (Student3 sto) ->{return sto.avgGrade>2.2;});
        System.out.println("------------------------------");

        stInfo.testStudents(list, (Student3 sto) -> sto.avgGrade<3.5);
        System.out.println("------------------------------");

        stInfo.testStudents(list, (sto) -> sto.age>23);
        System.out.println("------------------------------");

        /*-2-*/ stInfo.testStudents(list, sto ->sto.age<25);
        System.out.println("------------------------------");

        stInfo.testStudents(list, (Student3 sto) ->{int i=5; return sto.sex=='f';});
        System.out.println("------------------------------");

        stInfo.testStudents(list, (Student3 sto) ->{return (sto.avgGrade<4 && sto.age<27 && sto.sex=='f');});
        System.out.println("------------------------------");

        stInfo.testStudents(list, sto ->sto.avgGrade<4 && sto.age<27 && sto.sex=='f');
        System.out.println("------------------------------");
        System.out.println("------------------------------");

        for (Student3 s:list) System.out.print(s.name+" ");
        System.out.println("------------------------------");
        list.removeIf(x->x.name.startsWith("B"));
        list.removeIf(x->x.name.endsWith("a"));

        for (Student3 s:list) System.out.print(s.name+"  ");
    }
}

