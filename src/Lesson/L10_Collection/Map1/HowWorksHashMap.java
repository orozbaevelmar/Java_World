package Lesson.L10_Collection.Map1;

// В HashMap лучше использовать Immutable классов.(final)(String). Если класс не final то могут появиться проблемы
// после этого st1.course=4; ---->  st1.equals(st5)

// equals() and compareTo() должен вернуть одинаковый результат (TRUE & 0) следовательно

import java.util.*;

public class HowWorksHashMap {
    public static void main(String[] args) {
        Map<Student4,Double>map=new HashMap<>();
        Student4 st1=new Student4("Aktan","Bektemirov", 3);
        Student4 st2=new Student4("Kasym","Bektemirov", 2);
        Student4 st3=new Student4("Baiaman","Temirov",1);
        map.put(st1, 3.3);
        map.put(st2, 3.9);
        map.put(st3, 2.2);
        Student4 st5=new Student4("Aktan","Bektemirov", 3);
        System.out.println(map);
        System.out.println("----------------------");
        /*System.out.println(st1.hashCode());
        st1.course=4;
        System.out.println(st1.hashCode());
        System.out.println(map);
        System.out.println(st1.equals(st5)); // должен был вернуть TRUE*/

    }
}
final class Student4 implements Comparable<Student4> {
    final String name;
    final String surname;
    final int course;

    public Student4(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student4 student = (Student4) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    public int compareTo(Student4 o) {
       return this.name.compareTo(o.name);
    }
}
