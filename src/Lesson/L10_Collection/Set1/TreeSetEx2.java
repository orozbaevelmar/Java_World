package Lesson.L10_Collection.Set1;

import java.util.Objects;
import java.util.TreeSet;

// first()
// last()
// headSet(Student stud)
// tailSet(Student stud)
// subSet(Student von, Student bis)

// 5.equals() and compareTo() должен вернуть одинаковый результат (TRUE & 0) следовательно
//   мы тут treeSet Comparable только по course определили поэтому в equals(), hashCode() удалили name

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student8> treeSet = new TreeSet<>();
        Student8 st1 = new Student8("Aktan",  4);
        Student8 st2 = new Student8("Kasym",  2);
        Student8 st3 = new Student8("Baiaman",  3);
        Student8 st4 = new Student8("Saikal",  1);
        Student8 st5 = new Student8("Temir",  5);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println(treeSet);
        System.out.println("-------------------------");
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println("-------------------------");
        Student8 st6 = new Student8("Maksat",  3);
        System.out.println(treeSet.headSet(st6));
        System.out.println(treeSet.tailSet(st6));
        System.out.println("-------------------------");
        Student8 st7 = new Student8("Bakai",  2);
        Student8 st8 = new Student8("Tilek",  4);
        System.out.println(treeSet.subSet(st7,st8));
        System.out.println("-------------------------");
// -5-
        System.out.println(st2.equals(st7));
        System.out.println(st2.hashCode()==st7.hashCode());
        System.out.println(st2.compareTo(st7));

    }
}

class Student8 implements Comparable<Student8>{
    String name;
    int course;

    public Student8(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student8{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }


    public int compareTo(Student8 anotherStudent){
        return this.course-anotherStudent.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student8 student8 = (Student8) o;
        return course == student8.course; /*&& Objects.equals(name, student8.name);*/
    }

    @Override
    public int hashCode() {
        return Objects.hash(/*name,*/ course);
    }
}
