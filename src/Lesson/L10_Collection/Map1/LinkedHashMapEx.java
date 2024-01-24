package Lesson.L10_Collection.Map1;

// 1.LinkedHashMap является наследником HashMap. Хранит информацию о порядке добавления элементов или порядке их использования.
//   Производительность методов ниже, чем у методов HashMap.

// 2. Если параметр LinkedHashMap accessOrder TRUE, то порядок элементов будет изменяться, в зависимости от того какие
//    элементы были использованы, и в каком порядке. (put, get) Последний использованный элемент станет последним по порядку.в
// 3. Если false то ничего не измениться

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double,Student4> linHashMap=new LinkedHashMap<>(16, 0.75f, true);
        Student4 st1=new Student4("Aktan","Bektemirov", 3);
        Student4 st2=new Student4("Kasym","Bektemirov", 2);
        Student4 st3=new Student4("Baiaman","Temirov",1);
        Student4 st4=new Student4("Baiel","Sarov", 3);
        linHashMap.put(5.8, st1);
        linHashMap.put(9.1, st2);
        linHashMap.put(3.1, st4);
        linHashMap.put(6.5, st3);

        System.out.println(linHashMap);
        System.out.println("--------------------------");
        System.out.println(linHashMap.get(3.1));
        System.out.println(linHashMap.get(9.1));
        System.out.println("--------------------------");
        System.out.println(linHashMap);

    }
}
