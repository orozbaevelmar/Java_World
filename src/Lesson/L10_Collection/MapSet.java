package Lesson.L10_Collection;

import java.util.*;

// Lesson 18 ---MapSet2---equals(), hashCode();

public class MapSet {
    public static void main(String[] args) {
        Map<Person, Integer> map=new HashMap<>();
        Set<Person>set=new HashSet<>();

        Person person1=new Person(1, "Mike");
        Person person2=new Person(1, "Mike");


        map.put(person1, 123);
        map.put(person2, 123);

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);
    }
}
class Person {
    private int id;
    private String name;

    Person(int id, String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return "Person{"+
                "id="+id+
                ", name='"+name+'\''+'}';
    }
}

