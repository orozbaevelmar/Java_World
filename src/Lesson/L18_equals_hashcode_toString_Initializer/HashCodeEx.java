package Lesson.L18_equals_hashcode_toString_Initializer;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Если вы переопределили equals, то переопределите и hashCode.
// Результат нескольких выполнений метода hashCode для одного и того же объекта должен быть одинаковым
// Если согласно методу equals, два объекта равны, то и hashCode данных объектов обязательно должен быть одинаковым.
// Если согласно методу equals, два объекта НЕ равны, то hashCode данных объектов НЕ объязательно должен быть разным.
// Ситуация, когда результат метода hashCode для разных объектов одинаков,называется коллизией. Чем ее меньше, тем лучше.

public class HashCodeEx {
    public static void main(String[] args) {
        Map<Student9, Double> map=new HashMap<>();
        Student9 st1=new Student9("Aktan", "Bektemirov", 3);
        Student9 st2=new Student9("Bek", "Samarov", 2);
        Student9 st3=new Student9("Tash", "Bektemirov", 4);
        map.put(st1, 3.3);
        map.put(st2, 2.3);
        map.put(st3, 4.0);
        System.out.println(map);

        Student9 st4=new Student9("Aktan", "Bektemirov", 3);
        boolean result=map.containsKey(st4);
        System.out.println("result = "+result);

        System.out.println(st1.hashCode());
    }
}
class Student9{
    String name;
    String surname;
    int course;
    public Student9(String name, String surname, int course){
        this.name=name;
        this.surname=surname;
        this.course=course;
    }

    @Override
    public String toString() {
        return "Student9{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }
       @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student9 student9 = (Student9) o;
        return course == student9.course && Objects.equals(name, student9.name) && Objects.equals(surname, student9.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

}
