package Lesson.L10_Collection.Set1;

// 1.Set-коллекция, хранящая уникальные элементы. Методы данной коллекции очень быстры.
// 2.HashSet не запоминает порядок добавления элементов. В основе HashSet лежит HashMap. У элементов данного HashMap:
//   ключи-это ключи HashSet, значения-это константа-заглушка

// add, remove, size, isEmpty(), contains

import java.util.*;
public class HashSetEx2 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Aktan");
        set.add("Bek");
        set.add("Talas");
        set.add("Manas");
        set.add("Aktan");
        set.add(null);
        for (String s:set){
            System.out.println(s);
        }
        System.out.println("------------------------");
        set.remove("Talas");
        System.out.println(set);
        System.out.println("------------------------");
        System.out.println(set.size());
        System.out.println("------------------------");
        System.out.println(set.isEmpty());
        System.out.println("------------------------");
        System.out.println(set.contains("Manas"));
    }
}
