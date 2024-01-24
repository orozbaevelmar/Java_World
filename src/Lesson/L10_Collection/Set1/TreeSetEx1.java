package Lesson.L10_Collection.Set1;

// 1.TreeSet хранит элементы в отсортированном по возрастанию порядке. В основе TreeSet лежит TreeMap. У элементов данного
//   TreeMap:ключи - это элементы TreeSet, значения - это константа-заглушка.
// 2.

import java.util.*;

public class TreeSetEx1 {
    public static void main(String[] args) {
        Set<Integer> treeSet=new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(10);
        /*treeSet.add(null);  WRONG  */
        System.out.println(treeSet);
        treeSet.remove(2);
        System.out.println(treeSet);
        System.out.println("-----------------------");
        System.out.println(treeSet.contains(1));
        System.out.println(treeSet.contains(2));
    }
}
