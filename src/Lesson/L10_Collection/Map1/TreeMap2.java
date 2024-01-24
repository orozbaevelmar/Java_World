package Lesson.L10_Collection.Map1;

// Если key Map-а будет класс то нужно с помощью Comparable определить элементы внутри класса. Есть два способа.

/*  (1)  new Comparator<Student4>() {
@Override
public int compare(Student4 o1, Student4 o2) {
        return 0;
}*/

/*   (2)  public int compareTo(Student4 o) {
        return this.name.compareTo(o.name);
  }*/


import java.util.*;

public class TreeMap2 {
    public static void main(String[] args) {
        TreeMap<Student4, Double> treeMap5=new TreeMap<>(new Comparator<Student4>() {
            @Override
            public int compare(Student4 o1, Student4 o2) {
                return 0;
            }
        });
        TreeMap<Student4, Double> treeMap=new TreeMap<>();
        Student4 st1=new Student4("Aktan","Bektemirov", 3);
        Student4 st2=new Student4("Kasym","Bektemirov", 2);
        Student4 st3=new Student4("Baiaman","Temirov",1);
        Student4 st4=new Student4("Aktan","Sarov", 3);
        Student4 st5=new Student4("Kasym","Chekov", 2);
        Student4 st6=new Student4("Baiaman","Akylbekov",1);
        Student4 st7=new Student4("Baiaman","Temirov",1);
        Student4 st8=new Student4("Tash","Tashov",1);
        treeMap.put(st1, 5.8);
        treeMap.put(st2, 9.1);
        treeMap.put(st3, 6.5);
        treeMap.put(st4, 3.1);
        treeMap.put(st5, 9.9);
        treeMap.put(st6, 8.1);
        treeMap.put(st7, 1.1);
        treeMap.put(st8, 9.9);  // implement Comparable<T>



    }
}
