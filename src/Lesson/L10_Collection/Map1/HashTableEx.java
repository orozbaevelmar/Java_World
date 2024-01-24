package Lesson.L10_Collection.Map1;

// 1.HashTable устаревший класс, который работает по тем же принципам, что и HashMap. В отличии от HashMap
//   является synchronized. По этой причине его методы далеко не такие быстрые.
// 2.В HashTable ни ключ, ни значение не могут быть null
// 3.Даже если нужна поддержка многопоточночти HashTable лучше не использовать. Следует использовать ConcurrentHashMap

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Double, Student4> hashTable=new Hashtable<>();
        Student4 st1=new Student4("Aktan","Bektemirov", 3);
        Student4 st2=new Student4("Kasym","Bektemirov", 2);
        Student4 st3=new Student4("Baiaman","Temirov",1);
        Student4 st4=new Student4("Aktan","Sarov", 3);

        hashTable.put(3.1, st4);
        hashTable.put(5.8, st1);
        hashTable.put(9.1, st2);
        hashTable.put(6.5, st3);

        System.out.println(hashTable);

       /* hashTable.put(null, st4);  WRONG */
    }
}