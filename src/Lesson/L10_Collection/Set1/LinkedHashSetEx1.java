package Lesson.L10_Collection.Set1;

// 1.LinkedHashSet является наследником HashSet. Хранит информацию о порядке добавления элементов. Производительность методов немного
//   ниже, чем у методов HashSet. В основе LinkedHashSet лежит HashMap. У элементов данного HashMap:ключи - это элементы LinkedHashSet,
//   значенения - это константа-заглушка.

import java.util.LinkedHashSet;

public class LinkedHashSetEx1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linHashSet=new LinkedHashSet<>();
        linHashSet.add(5);
        linHashSet.add(3);
        linHashSet.add(1);
        linHashSet.add(8);
        linHashSet.add(10);
        System.out.println(linHashSet);
        linHashSet.remove(8);
        System.out.println(linHashSet);
        System.out.println(linHashSet.contains(8));
        System.out.println(linHashSet.contains(10));
    }
}
