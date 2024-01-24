package Lesson.L21_Lambda_var;
import java.util.*;

// 1.Чтобы лямбда выражение сработало, внутри интерфейса нужно только одного метода написать (Если есть 2 параметра внутри интерфейса,
//   метод testStudents не поймет, какого метода внутри интерфейсов нужно использовать).
// 2.Самый короткий вариант написания лямбда выражения:  stud->stud.avgGrade>3.3
// 3.Более полный вариант написания лямбда выражения: (Student stud)->{return stud.avgGrade>2.2;}
// 4.В лямбда выражении оператор стрелка разделяет параетры метода и тело метода.
// 5.В лямбда выражении справа от оператора стрелка находится тело метода, которое было у метода соответствующего класса, имплементировавшего
//   наш интерфейс с единственным методом
// 6.Вы можете использовать смешанный варинат написания лямбда выражения:слева от оператора стрелка писать короткий вариант, справа-полный. Или наоборот.

public class Lambda1_Sort {
}
class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student(String name, char sex, int age, int course, double avgGrade){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.course=course;
        this.avgGrade=avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
class StudentInfo {
    void printStudent(Student st){
        System.out.println("Name of student: "+st.name+", sex: "+ st.sex+", age: "+st.age+", course: "+st.course+", avgGrade: "+st.avgGrade);
    }
    void testStudents(ArrayList<Student> aL, StudentChecks sc){
        for (Student student:aL){
            if (sc.test(student)){
                printStudent(student);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student> list=new ArrayList<>();
        Student st1=new Student("Aktan", 'm', 22, 3,3.2);
        Student st2=new Student("Aidinai", 'f', 25, 1,3.3);
        Student st3=new Student("Bek", 'm', 19, 4,4.0);
        Student st4=new Student("Eliza", 'f', 27, 2,2.1);
        Student st5=new Student("Esen", 'm', 20, 1,1.0);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo stInfo=new StudentInfo();

        stInfo.testStudents(list, new StudentChecks() {
            @Override
            public boolean test(Student s) {
                return s.age>30;
            }
        });

        stInfo.testStudents(list, (Student sto) ->{return sto.avgGrade>2.2;});
        System.out.println("------------------------------");

        stInfo.testStudents(list, (Student sto) -> sto.avgGrade<3.5);
        System.out.println("------------------------------");

        stInfo.testStudents(list, (sto) -> sto.age>23);
        System.out.println("------------------------------");

/*-2-*/stInfo.testStudents(list, sto ->sto.age<25);
        System.out.println("------------------------------");

        stInfo.testStudents(list, (Student sto) ->{int i=5; return sto.sex=='f';});
        System.out.println("------------------------------");

        stInfo.testStudents(list, (Student sto) ->{return (sto.avgGrade<4 && sto.age<27 && sto.sex=='f');});
        System.out.println("------------------------------");

        stInfo.testStudents(list, sto ->sto.avgGrade<4 && sto.age<27 && sto.sex=='f');
        System.out.println("------------------------------");

        Collections.sort(list, new Comparator<Student>(){
            @Override
            public int compare(Student s1,Student s2){
                return s1.course-s2.course;
            }
        });

        Collections.sort(list, (firstSt, secondSt) -> { return firstSt.course - secondSt.course;});

        for (Student a:list){
            System.out.println(a);
        }
    }
}

interface StudentChecks {
    boolean test(Student s);
}