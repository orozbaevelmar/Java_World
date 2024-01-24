package Lesson.L18_equals_hashcode_toString_Initializer;

// При вызове getClass() может отработать полиморфизм, и результатом будет класс-потомок.

import java.util.*;
import java.util.Objects;

public class MapSet2 {
    public static void main(String[] args) {
        Map <Person2,String> map=new HashMap<>();
        Set<Person2> set=new HashSet<>();

        Person2 person1=new Person2(1,"q");
        Person2 person2=new Person2(1,"q");

        map.put(person1,"123");
        map.put(person2, "123");

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println("------------------");
        System.out.println(set);
    }
}
class Person2 {
    private int id;
    private String name;

    Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person2 person2 = (Person2) o;

        if (id != person2.id) return false;
        return name != null ? name.equals(person2.name) : person2.name == null;
    }
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    /* Контракт hashCode() equals()
     1. У двух проверяемых объектов вызываем метод hashCode()
     если хеши разные -> два объекта точно разные.(false)

     2.если хеши одинаковые, то работать будет ->equals()

     3. equals() ->выдает ответ
    */
}