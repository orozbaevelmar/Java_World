package Lesson.L10_Collection.Map1;

// Элементами TreeMap являются пары ключ/значение. В TreeMap элементы хранят в отсортированном по возрастанию порядке.
// В основе TreeMap лежит красно-черное дерево. Это позволяет методам работать быстро, но не быстрее, чем методы HashMap.
// put, get, remove
// descendingMap -->по убыванию
// tailMap -->
// headMap -->
// firstEntry -->
// lastEntry -->
//

import java.util.*;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Double, Student4> treeMap=new TreeMap<>();
        Student4 st1=new Student4("Aktan","Bektemirov", 3);
        Student4 st2=new Student4("Kasym","Bektemirov", 2);
        Student4 st3=new Student4("Baiaman","Temirov",1);
        Student4 st4=new Student4("Aktan","Sarov", 3);
        Student4 st5=new Student4("Kasym","Chekov", 2);
        Student4 st6=new Student4("Baiaman","Akylbekov",1);
        Student4 st7=new Student4("Baiaman","Temirov",1);
        Student4 st8=new Student4("Tash","Tashov",1);
        treeMap.put(5.8, st1);
        treeMap.put(9.1, st2);
        treeMap.put(6.5, st3);
        treeMap.put(3.1, st4);
        treeMap.put(9.9, st5);
        treeMap.put(8.1, st6);
        treeMap.put(1.1, st7);
        treeMap.put(9.9, st8);

        for (Map.Entry<Double, Student4> entry: treeMap.entrySet()){
            System.out.println(entry);
        }
        System.out.println("---------------------");
        System.out.println(treeMap.get(6.5));
        treeMap.remove(1.1);
        System.out.println(treeMap);
        System.out.println("---------------------");
        System.out.println(treeMap.descendingMap());
        System.out.println("---------------------");
        System.out.println(treeMap.tailMap(7.3));
        System.out.println(treeMap.headMap(6.0));
        System.out.println("---------------------");
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
    }
}
