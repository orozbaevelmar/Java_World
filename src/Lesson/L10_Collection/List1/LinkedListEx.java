package Lesson.L10_Collection.List1;

import java.util.*;

// Элементы LinkedList - это звенья одной цепочки. Эти элементы хранят определенные данные, а также ссылки на предыдущий и след.элементы.
// Как правило, LinkedList следует использовать когда:
// 1.Невелико количество операций получения элементов;
// 2.Велико количество операций добавления и удаления элементов. Особенно если речь идет о элементах в начале коллекции.


public class LinkedListEx {
    public static void main(String[] args) {
        Student2 st1=new Student2("A", 3);
        Student2 st2=new Student2("B", 2);
        Student2 st3=new Student2("C", 4);
        Student2 st4=new Student2("D", 1);
        Student2 st5=new Student2("E", 3);

        LinkedList<Student2> studLinkList = new LinkedList<>();
        studLinkList.add(st1);
        studLinkList.add(st2);
        studLinkList.add(st3);
        studLinkList.add(st4);
        studLinkList.add(st5);
        System.out.println(studLinkList);

        Student2 st6=new Student2("G",2);
        studLinkList.add(1, st6);
        System.out.println(studLinkList);


    }
}
class Student2{
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
