package Lesson.L16_Stream_Interface;

import java.util.ArrayList;
import java.util.List;

// flatMap(i) return stream;
// Когда нужно поработать с элементами элементов нашей коллекции, мы можем использовать метод flatMap()

public class FlatMap_StreamMethod_I {
    public static void main(String[] args) {
        Student7 st1=new Student7("Aktan", 'm', 22, 3,3.2);
        Student7 st2=new Student7("Aidinai", 'f', 25, 1,3.3);
        Student7 st3=new Student7("Bek", 'm', 19, 4,4.0);
        Student7 st4=new Student7("Eliza", 'f', 27, 2,2.1);
        Student7 st5=new Student7("Esen", 'm', 20, 1,1.0);

        Faculty f1=new Faculty("Economics");
        Faculty f2=new Faculty("Applied mathematics");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList=new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(e-> System.out.println(e.getName()));
    }
}

class Faculty{
    String name;
    List<Student7> studentsOnFaculty;

    public Faculty(String name){
            this.name=name;
            studentsOnFaculty=new ArrayList<>();
    }
    public List<Student7>getStudentsOnFaculty(){
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student7 st){
        studentsOnFaculty.add(st);
    }
}
